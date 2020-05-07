package Kitchen_TEST_DUMMY;

import java.util.ArrayList;

public class DaoImplArrayList implements Dao {
	private ArrayList<Product> datas;

	public DaoImplArrayList() {
		datas = new ArrayList<Product>();
	}

	@Override
	public void insert(Product p) {
		// TODO Auto-generated method stub
		datas.add(p);
	}

	@Override
	public int getIdxByNum(int num) {// ���� ���ص� ��
		// TODO Auto-generated method stub
		System.out.println("��������");
		return 0;
	}

	@Override
	public Product selectByNum(int num) {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setNum(num);
		int idx = datas.indexOf(p);
		if (idx < 0) {
			return null;
		} else {
			return datas.get(idx);
		}
	}

	@Override
	public Product[] selectByName(String name) {
		// TODO Auto-generated method stub
		System.out.println("��������");
		return null;
	}

	@Override
	public Product[] selectAll() {
		// TODO Auto-generated method stub
		System.out.println("��������");
		return null;
	}

	@Override
	public void updatePrice(Product p) {
		// TODO Auto-generated method stub
		int idx = datas.indexOf(p);
		if (idx < 0) {
			System.out.println("���� ��ǰ ��ȣ");
		} else {
			Product x = datas.get(idx);
			x.setPrice(p.getPrice());
		}
	}

	@Override
	public boolean in_out(Product p) {
		// TODO Auto-generated method stub
		Product p2 = null;
		int idx = datas.indexOf(p);
		if (idx < 0) {
			System.out.println("���� ��ǰ ��ȣ");
			return false;
		} else {
			p2 = datas.get(idx);
		}
		switch (p.getName()) {
		case "in":
			p2.setAmount(p2.getAmount() + p.getAmount());
			break;
		case "out":
			if (p2.getAmount() >= p.getAmount()) {
				p2.setAmount(p2.getAmount() - p.getAmount());
			} else {
				System.out.println("������������ ��� ���");
				return false;
			}
			break;
		}
		return true;
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setNum(num);
		if (datas.remove(p)) {
			System.out.println(num + "�� ��ǰ ���� �Ϸ�");
		} else {
			System.out.println(num + "�� ��ǰ ���� ����");
		}
	}

	@Override
	public ArrayList<Product> selectByName2(String name) {
		// TODO Auto-generated method stub
		ArrayList<Product> al = new ArrayList<Product>();
		for (Product p : datas) {
			if (name.equals(p.getName())) {
				al.add(p);
			}
		}
		return al;
	}

	@Override
	public ArrayList<Product> selectAll2() {
		// TODO Auto-generated method stub
		return datas;
	}

}
