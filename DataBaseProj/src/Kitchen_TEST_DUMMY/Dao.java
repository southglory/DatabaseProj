package Kitchen_TEST_DUMMY;

import java.util.ArrayList;

public interface Dao {
	void insert(Product p);
	int getIdxByNum(int num);
	Product selectByNum(int num);
	Product[] selectByName(String name);
	Product[] selectAll();
	void updatePrice(Product p);
	boolean in_out(Product p);
	void delete(int num);
	ArrayList<Product> selectByName2(String name);
	ArrayList<Product> selectAll2();
}
