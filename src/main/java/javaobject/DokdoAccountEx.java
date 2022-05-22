package javaobject;

public class DokdoAccountEx {

	public static void main(String[] args) {
		DokdoAccount accountHolder = new DokdoAccount("111-22-55555", "Min", 0);
		accountHolder.deposit(30000);
		accountPrint(accountHolder);
		accountHolder.deposit(80000);
		accountPrint(accountHolder);
	}
	// 클래스도 데이터 타입이다. DokdoAccount obj 는 obj 라는 변수의 데이터 타입으로 DokdoAccount 를 둔 것이다. 
	public static void accountPrint(DokdoAccount obj) {
		System.out.println("Account Number : " + obj.accountNo);
		System.out.println("Account Holder Name : " + obj.ownerName);
		System.out.println("Balance : " + obj.balance);
		System.out.println("Point : " + obj.point);
		System.out.println("===========================");
	}

}
