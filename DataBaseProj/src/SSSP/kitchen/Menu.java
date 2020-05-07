package SSSP.kitchen;
/*
 2.주방(영광)
(1)주문 조회
(2)냉장고 확인-재료 부족하면 주문취소 처리
(3)음식조리
(4)주문마감-하루매출 계산
(5)이번달 매출 조회
 */
import java.util.Scanner;

public class Menu {

//	Service service = new Service();

	public void run(Scanner sc) {
		boolean flag = true;
		String menu;
		String str = "1.조리대기 주문조회 2.냉장고 확인 3.음식조리 4.주문마감(하루매출 계산) 5.지난 매출 조회 6.나가기";
		while (flag) {
			System.out.println(str);
			menu = sc.next();
//			switch (menu) {
//			case "1":
//				service.selectOrder(sc);
//				break;
//			case "2":
//				service.selectIngre(sc);
//				break;
//			case "3":
//				service.setProduct(sc);
//				break;
//			case "4":
//				service.delMember(sc);
//				break;
//			case "5":
//				service.printAll();
//				break;
//			case "6":
//				flag = false;
//			default:
//				System.out.println("1부터 6까지 입력하세요.");
//			}
		}
	}
}

