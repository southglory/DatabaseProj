package order;

public class Order {

	private int orderNum;// �ֹ���ȣ
	private int menuNum;// �޴���ȣ
	private int qty;// �ֹ�����
	private int price;// ���� �޴� ����

	public Order() {

	}

	public Order(int orderNum, int menuNum, int qty, int price) {
		this.orderNum = orderNum;
		this.menuNum = menuNum;
		this.qty = qty;
		this.price = price;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public int getMenuNum() {
		return menuNum;
	}

	public void setMenuNum(int menuNum) {
		this.menuNum = menuNum;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "�ֹ� [�ֹ���ȣ=" + orderNum + ", �޴���ȣ=" + menuNum + ", �ֹ�����=" + qty + ", �����ݾ�=" + price + "]";
	}

}
