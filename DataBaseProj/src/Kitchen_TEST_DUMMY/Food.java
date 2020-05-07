package Kitchen_TEST_DUMMY;

public class Food {

	private int num;
	private String name;

	public Food() {

	}

	public Food(int num, String name) {
		this.num = num;
		this.name = name;
	}

	public String printMenu() {
		return "¸Þ´º [" + num + "¹ø, " + name + "]";
	}
}
