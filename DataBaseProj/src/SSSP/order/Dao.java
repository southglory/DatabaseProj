package SSSP.order;

import java.util.ArrayList;

import SSSP.kitchen.Food;

public interface Dao {

	// �޴� ��ȸ
	ArrayList<Food> selectAllMenu();

	// �ֹ���ٱ���
	void insert(Order o);

	// �� �ֹ���� Ȯ��
	ArrayList<Order> selectAllOrder();

	// �ֹ� ����
	void update(Order o);

	// �ֹ� ���
	void delete(int num);

	// �� �����ݾ� ���
	int calTotalPrice();

	// ����
	boolean pay(int num);

}
