package javaobject;

public class GoodsStockMain {

	public static void main(String[] args) {
		int amount;
		GoodsStock pen = new GoodsStock();
		pen.goodsCode = "mo123456";
		pen.stock = 100;
		pen.addStock(200);
		amount = pen.subtractStock(30);
		System.out.println("상품코드: " + pen.goodsCode + " 입니다.");
		System.out.println("재고 수량은 " + pen.stock + " 개 입니다.");
		System.out.println("판매 수량은 " + amount + " 개 입니다.");

	}

}
