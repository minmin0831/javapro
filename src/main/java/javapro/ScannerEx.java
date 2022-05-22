package javapro;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("금액을 입력하시오 >");
		int money=sc.nextInt(); // 입력 받은 값을 변수에 저장한다. 
		int fiftyThousand=money/50000;
		money=money%50000;
		int tenThousand=money/10000;
		money=money%10000;
		int fiveThousand=money/5000;
		money=money&5000;
		int thousand=money/1000;
		money=money%1000;
		int fiveHundred=money/500;
		money=money%500;
		int hundred=money/100;
		money=money%100;
		int fifty=money/50;
		money=money%50;
		int ten=money/10;
		money=money%10;
		
		System.out.println("오만원권 >" + fiftyThousand);
		System.out.println("만원권 >" + tenThousand);
		System.out.println("오천원권 >" + fiveThousand);
		System.out.println("일천원권 >" + thousand);
		System.out.println("오백원권 >" + fiveHundred);
		System.out.println("일백원권 >" + hundred);
		System.out.println("오십원권 >" + fifty);
		System.out.println("일십원권 >" + ten);
		
	}

}
