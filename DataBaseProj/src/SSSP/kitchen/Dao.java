package SSSP.kitchen;

import java.util.ArrayList;

import SSSP.order.Order;

public interface Dao {

		// 조리대기 주문조회
		ArrayList<Order> selectWaitingOrders();
		void printWaiting();
		
		// 냉장고 재료 잔량 확인
		ArrayList<Ingredient> printStockIgdt();
		
		// 음식 조리
		void cook(Order o);
		
		// 음식 재료 확인
		ArrayList<Ingredient> printRecipe(Food food);

		// 주문 마감
		int endOrder();//주문 마감하고 하루  매출 출력.

		// 이번달 매출 조회
		int calMonthly();

}
