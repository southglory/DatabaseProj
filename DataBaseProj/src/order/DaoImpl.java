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
	private int total_price;// �����ݾ�.�޴���ȣ�� �޴�DB�� �����ؼ� ���

	public DaoImpl() {
		db = DBConn.getInstance();
	}

	@Override
	public ArrayList<Food> selectAllMenu() {
		// �޴� ��ȸ
		String sql = "select num, name from food order by num";
		ArrayList<Food> list = new ArrayList<Food>();
		ResultSet rs = null;
		Connection conn = db.getConnect();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();// �б� ����
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
		// �ֹ���ٱ���
		String sql = "insert into ordr(seq_order,?,?,?)";// �ֹ���ȣ(�ڵ�),�޴���ȣ(�Ĵ�),����,�����ݾ�
		Connection conn = db.getConnect();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, o.getMenuNum());
			pstmt.setInt(2, o.getQty());
			pstmt.setInt(3, o.getPrice());
			pstmt.executeUpdate();// ���� ����
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
		// �� �ֹ���� Ȯ��
		String sql = "select * from ordr";// �ֹ���ȣ,�޴���ȣ,����
		ArrayList<Order> list = new ArrayList<Order>();
		ResultSet rs = null;
		Connection conn = db.getConnect();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();// �б� ����
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
		// �ֹ� ����
		String sql = "update ordr set qty=? where orderNum=?";// �ֹ����� ����
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
		// �ֹ� ���

	}

	@Override
	public int calTotalPrice() {
		// �� �����ݾ� ���
		String sql = "select * from ord";
		return 0;
	}

	@Override
	public boolean pay(int num) {
		// ����
		return false;
	}

}
