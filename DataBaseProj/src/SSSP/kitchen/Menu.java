package SSSP.kitchen;
/*
 2.�ֹ�(����)
(1)�ֹ� ��ȸ
(2)����� Ȯ��-��� �����ϸ� �ֹ���� ó��
(3)��������
(4)�ֹ�����-�Ϸ���� ���
(5)�̹��� ���� ��ȸ
 */
import java.util.Scanner;

public class Menu {

//	Service service = new Service();

	public void run(Scanner sc) {
		boolean flag = true;
		String menu;
		String str = "1.������� �ֹ���ȸ 2.����� Ȯ�� 3.�������� 4.�ֹ�����(�Ϸ���� ���) 5.���� ���� ��ȸ 6.������";
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
//				System.out.println("1���� 6���� �Է��ϼ���.");
//			}
		}
	}
}

