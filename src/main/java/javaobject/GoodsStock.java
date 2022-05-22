package javaobject;

public class GoodsStock {
	String goodsCode;
	int stock;
	
	void addStock(int amount) {
		stock += amount;
	}
	
	int subtractStock(int amount) {
		if(stock < 0) {
			return 0;
		}
		stock -= amount;
		return amount;
	}

}
