package order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dbconn.DBConn;
import kitchen.Food;

public class DaoImpl implements Dao {

	private DBConn db;
	private int total_price;// 결제금액.메뉴번호로 메뉴DB에 접근해서 계산

	public DaoImpl() {
		db = DBConn.getInstance();
	}

	@Override
	public ArrayList<Food> selectAllMenu() {
		// 메뉴 조회
		String sql = "select num, name from food order by num";
		ArrayList<Food> list = new ArrayList<Food>();
		ResultSet rs = null;
		Connection conn = db.getConnect();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();// 읽기 실행
			while (rs.next()) {
				int num = rs.getInt(1);
				String name = rs.getString(2);
				Food f = new Food(num, name);
				list.add(f);
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
	public void insert(Order o) {
		// 주문장바구니
		String sql = "insert into ordr(seq_order,?,?,?)";// 주문번호(자동),메뉴번호(식당),수량,결제금액
		Connection conn = db.getConnect();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, o.getMenuNum());
			pstmt.setInt(2, o.getQty());
			pstmt.setInt(3, o.getPrice());
			pstmt.executeUpdate();// 쓰기 실행
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
	}

	@Override
	public ArrayList<Order> selectAllOrder() {
		// 내 주문목록 확인
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
	public void update(Order o) {
		// 주문 수정
		String sql = "update ordr set qty=? where orderNum=?";// 주문수량 수정
		Connection conn = db.getConnect();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, o.getQty());
			pstmt.setInt(2, o.getOrderNum());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int num) {
		// 주문 취소

	}

	@Override
	public int calTotalPrice() {
		// 총 결제금액 계산
		String sql = "select * from ord";
		return 0;
	}

	@Override
	public boolean pay(int num) {
		// 결제
		return false;
	}

}
