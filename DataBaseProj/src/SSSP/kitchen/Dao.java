package SSSP.kitchen;

import java.util.ArrayList;

import SSSP.order.Order;

public interface Dao {

		// ������� �ֹ���ȸ
		ArrayList<Order> selectWaitingOrders();
		void printWaiting();
		
		// ����� ��� �ܷ� Ȯ��
		ArrayList<Ingredient> printStockIgdt();
		
		// ���� ����
		void cook(Order o);
		
		// ���� ��� Ȯ��
		ArrayList<Ingredient> printRecipe(Food food);

		// �ֹ� ����
		int endOrder();//�ֹ� �����ϰ� �Ϸ�  ���� ���.

		// �̹��� ���� ��ȸ
		int calMonthly();

}
