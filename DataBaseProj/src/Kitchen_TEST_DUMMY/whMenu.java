package Kitchen_TEST_DUMMY;

import java.util.Scanner;

public class whMenu {
	private Service service;
	

	public whMenu(Service service, hw2.order.Service o) {
		this.service = service;
		oService = o;
	}

	public void run(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		String str = "1.��ǰ��� 2.��ȣ�ΰ˻� 3.�̸����ΰ˻� 4.���ݼ��� 5.�԰� 6.���� 7.��ǰ��ü��� 8.��� 9.����";
		while (flag) {
			System.out.println(str);
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				service.addProduct(sc);
				break;
			case 2:
				service.printProduct(sc);
				break;
			case 3:
				service.getByName(sc);
				break;
			case 4:
				service.editPrice(sc);
				break;
			case 5:
				service.in(sc);
				break;
			case 6:
				service.delProduct(sc);
				break;
			case 7:
				service.printAll();
				break;
			case 8:
				service.out(oService.getOutList());
				break;
			case 9:
				flag = false;
			}
		}
	}
}
