package javapro;

public class OperationEx4 {

	public static void main(String[] args) {
		int[] amounts= {10, 5, 3};
		int[] prices = {1000, 500, 1000};
		int discountedPrice;
		int sellingPrice;
		
		for(int i=0; i<=amounts.length; i++) {
			for(int j=0; j<=prices.length; j++) {
				
				if(amounts[i]>= 10 && prices[j]>=1000) {
					
					discountedPrice=(int)(amounts[i]*prices[j]*0.8);
					System.out.println("할인금액:" + discountedPrice);
					
					sellingPrice=amounts[i]*prices[j];
					System.out.println("판매금액:" + sellingPrice);
				}
		}	
	}	
	}
}
