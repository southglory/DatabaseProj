package Kitchen_TEST_DUMMY;

import java.util.ArrayList;

public class DaoImpl implements Dao {

	private Product[] datas;
	private int cnt;

	public DaoImpl() {
		datas = new Product[30];
	}

	@Override
	public void insert(Product p) {
		// TODO Auto-generated method stub
		if (cnt >= datas.length) {
			System.out.println("저장소가 찼다. 추가취소");
			return;
		}

		datas[cnt] = p;
		cnt++;
	}

	@Override
	public int getIdxByNum(int num) {
		// TODO Auto-generated method stub
		int i;
		for (i = 0; i < cnt; i++) {
			if (num == datas[i].getNum()) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public Product selectByNum(int num) {
		// TODO Auto-generated method stub
		int idx = getIdxByNum(num);
		if (idx >= 0) {
			return datas[idx];
		}
		return null;
	}

	@Override
	public Product[] selectByName(String name) {
		// TODO Auto-generated method stub
		int i = 0, j;
		Product[] x = new Product[cnt];
		for (j = 0; j < cnt; j++) {
			if (name.equals(datas[j].getName())) {
				x[i++] = datas[j];
			}
		}
		Product[] y = new Product[i];
		System.arraycopy(x, 0, y, 0, i);
		x = null;
		return y;
	}

	@Override
	public Product[] selectAll() {
		// TODO Auto-generated method stub
		Product[] y = new Product[cnt];
		System.arraycopy(datas, 0, y, 0, cnt);
		return y;
	}

	@Override
	public void updatePrice(Product p) {
		// TODO Auto-generated method stub
		Product p2 = selectByNum(p.getNum());
		if (p2 == null) {
			System.out.println("없는 제품. 가격 수정 취소");
		} else {
			p2.setPrice(p.getPrice());
		}
	}

	@Override
	public boolean in_out(Product p) {// num:입출고할 제품번호, name:입출고구분값,
										// amount:입출고수량
		// TODO Auto-generated method stub
		Product p2 = selectByNum(p.getNum());
		if (p2 == null) {
			System.out.println("없는 제품." + p.getName() + " 취소");
		} else {
			switch (p.getName()) {
			case "in":
				p2.setAmount(p2.getAmount() + p.getAmount());
				break;
			case "out":
				if (p2.getAmount() >= p.getAmount()) {
					p2.setAmount(p2.getAmount() - p.getAmount());
				} else {
					System.out.println("수량부족으로 출고 취소");
					return false;
				}
				break;
			}
		}
		return true;
	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub
		int idx = getIdxByNum(num);
		if (idx < 0) {
			System.out.println("없는 제품. 삭제 취소");
		} else {
			for (int i = idx; i < cnt - 1; i++) {
				datas[i] = datas[i + 1];
			}
			cnt--;
		}
	}

	@Override
	public ArrayList<Product> selectByName2(String name) {
		// TODO Auto-generated method stub
		System.out.println("지원안함");
		return null;
	}

	@Override
	public ArrayList<Product> selectAll2() {
		// TODO Auto-generated method stub
		System.out.println("지원안함");
		return null;
	}

}
