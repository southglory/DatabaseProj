package SSSP;

import java.util.Scanner;
/*
 * <�������>
------------------------------------------------
1.�մ�(����)
(1)�޴� ��ȸ
(2)�ֹ���ٱ���
(3)�� �ֹ���� Ȯ��
(4)����-�л��̸� �л����� ����(30%)
------------------------------------------------
2.�ֹ�(����)
(1)�ֹ� ��ȸ
(2)����� Ȯ��-��� �����ϸ� �ֹ���� ó��
(3)��������
(4)�ֹ�����-�Ϸ���� ���
(5)�̹��� ���� ��ȸ
------------------------------------------------
3.ȸ��(����)
(1)ȸ������
(2)�α���
	4.�Խ���
	(1)�۾���-����
	(2)�۸�� Ȯ��
 */
//�����޴� ����.�ֹ�
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
		String str = "1. �մ� 2.�ֹ�  2.����";
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
