package SSSP;

import java.util.Scanner;
/*
 * <기능정리>
------------------------------------------------
1.손님(혜정)
(1)메뉴 조회
(2)주문장바구니
(3)내 주문목록 확인
(4)결제-학생이면 학생할인 적용(30%)
------------------------------------------------
2.주방(영광)
(1)주문 조회
(2)냉장고 확인-재료 부족하면 주문취소 처리
(3)음식조리
(4)주문마감-하루매출 계산
(5)이번달 매출 조회
------------------------------------------------
3.회원(지웅)
(1)회원가입
(2)로그인
	4.게시판
	(1)글쓰기-리뷰
	(2)글목록 확인
 */
//상위메뉴 공장.주문
public class Menu {
	private SSSP.order.Menu menu1;
	private SSSP.kitchen.Menu menu2;
	
	public Menu() {
		menu1 = new SSSP.order.Menu();
		menu2 = new SSSP.kitchen.Menu();
	}
	public void run(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		String str = "1. 손님 2.주방  2.종료";
		while (flag) {
			System.out.println(str);
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				menu1.run(sc);
				break;
			case 2:
				menu2.run(sc);
				break;
			case 3:
				flag = false;
			}
		}
	}
}
