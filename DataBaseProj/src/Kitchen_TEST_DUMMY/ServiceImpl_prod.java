package Kitchen_TEST_DUMMY;

import java.util.ArrayList;
import java.util.Scanner;

import hw2.order.Order;

//기능을 구현 클래스. 대부분의 기능에서 db작업이 필요하므로 Dao 객체가 필요하다. 그런데 db시스템이 교체되면 Dao의 내용도 변경되어야 하므로 
//교체하기 쉽게 인터페이스 타입으로 작성
public class ServiceImpl_prod implements Service {
	private Dao dao;

	public ServiceImpl_prod(Dao dao) {// 의존성 주입
		this.dao = dao;// 인터페이스를 활용한 업캐스팅. 이 연결고리가 부품교체 부분이 됨.
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void addProduct(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("name:");
		String name = sc.next();
		System.out.print("price:");
		int price = sc.nextInt();
		System.out.print("amount:");
		int amount = sc.nextInt();
		dao.insert(new Product(name, price, amount));
	}

	@Override
	public void printProduct(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("search num:");
		int num = sc.nextInt();
		Product p = dao.selectByNum(num);
		if (p == null) {
			System.out.println("없는 제품");
		} else {
			System.out.println(p);
		}
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		// Product[] d = dao.selectAll();
		ArrayList<Product> d = dao.selectAll2();
		for (Product p : d) {
			System.out.println(p);
		}
	}

	@Override
	public void getByName(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("search name:");
		String name = sc.next();
		// Product[] d = dao.selectByName(name);
		ArrayList<Product> d = dao.selectByName2(name);
		for (Product p : d) {
			System.out.println(p);
		}
	}

	@Override
	public void editPrice(Scanner sc) {
		// TODO Auto-generated method stub
		Product p = new Product();
		System.out.print("edit num:");
		p.setNum(sc.nextInt());
		System.out.print("new price:");
		p.setPrice(sc.nextInt());
		dao.updatePrice(p);
	}

	@Override
	public void in(Scanner sc) {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setName("in");
		System.out.print("입고할 제품 num:");
		p.setNum(sc.nextInt());
		System.out.print("입고량:");
		p.setAmount(sc.nextInt());
		dao.in_out(p);
	}


	@Override
	public void delProduct(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("del num:");
		int num = sc.nextInt();
		dao.delete(num);
	}

	@Override
	public Product getByNum(int num) {
		// TODO Auto-generated method stub
		return dao.selectByNum(num);
	}

	@Override
	public ArrayList<Product> getAll() {
		// TODO Auto-generated method stub
		return dao.selectAll2();
	}

}
