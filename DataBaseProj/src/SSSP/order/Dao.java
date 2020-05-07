package order;

import java.util.ArrayList;

import kitchen.Food;

public interface Dao {

	// 메뉴 조회
	ArrayList<Food> selectAllMenu();

	// 주문장바구니
	void insert(Order o);

	// 내 주문목록 확인
	ArrayList<Order> selectAllOrder();

	// 주문 수정
	void update(Order o);

	// 주문 취소
	void delete(int num);

	// 총 결제금액 계산
	int calTotalPrice();

	// 결제
	boolean pay(int num);

}
