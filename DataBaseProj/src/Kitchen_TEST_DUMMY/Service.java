package Kitchen_TEST_DUMMY;

import java.util.ArrayList;
import java.util.Scanner;

import hw2.order.Order;

public interface Service {
	void addProduct(Scanner sc);

	void printProduct(Scanner sc);//��ǰ��ȣ�� �˻��Ͽ� ��ǰ���

	void printAll();//��ü�˻��� ��� ���

	void getByName(Scanner sc);//�̸����� �˻��Ͽ� ��� ���

	void editPrice(Scanner sc);//��ǰ ��ȣ, ������ �Է¹޾Ƽ� ����

	void in(Scanner sc);//�԰�:��ǰ��ȣ�� �԰���� �Է¹޾Ƽ� ó��



	void delProduct(Scanner sc);//��ǰ ��ȣ �Է¹޾� ����
	
	Product getByNum(int num);//�ֹ��ʿ� 
	ArrayList<Product> getAll();
}
