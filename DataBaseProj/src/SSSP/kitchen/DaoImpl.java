package SSSP.kitchen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import SSSP.order.Order;
import dbconn.DBConn;

public class DaoImpl implements Dao {
	private DBConn db;

	public DaoImpl() {
		db = DBConn.getInstance();
	}
	
	
	
	@Override
	public ArrayList<Order> selectWaitingOrders() {
		// TODO Auto-generated method stub
		
		
		// 조리 전 주문목록 확인
				String sql = "select * from ordr";// 주문번호,메뉴번호,수량
				ArrayList<Order> list = new ArrayList<Order>();
				ResultSet rs = null;
				Connection conn = db.getConnect();
				try {
					PreparedStatement pstmt = conn.prepareStatement(sql);
					rs = pstmt.executeQuery();// 읽기 실행
					while (rs.next()) {
						int orderNum = rs.getInt(1);
						int menuNum = rs.getInt(2);
						int qty = rs.getInt(3);
						int price = rs.getInt(4);
						Order o = new Order(orderNum, menuNum, qty, price);
						list.add(o);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				return list;
			}
	


	@Override
	public void printWaiting() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public ArrayList<Ingredient> printStockIgdt() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public ArrayList<Ingredient> printRecipe(Food food) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void cook(Order o) {
		// TODO Auto-generated method stub

	}

	@Override
	public int endOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calMonthly() {
		// TODO Auto-generated method stub
		return 0;
	}

}
