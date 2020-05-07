package Kitchen_TEST_DUMMY;

//모든 멤버변수와 메서드에 접근제어자를 붙이고, private 멤버변수에 대해서 setter, getter를 만드시오
public class Product {
	private int num;
	private String name;
	private int price;
	private int amount;
	private static int cnt;

	public Product() {
	}

	public Product(String name, int price, int amount) {
		this.num = ++cnt;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj != null && obj instanceof Product) {
			Product p = (Product) obj;
			if (num == p.num) {
				return true;
			}
		}
		return false;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Product [num=" + num + ", name=" + name + ", price=" + price + ", amount=" + amount + "]";
	}

}
