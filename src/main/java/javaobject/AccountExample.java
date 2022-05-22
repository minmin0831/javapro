package javaobject;

public class AccountExample {

	public static void main(String[] args) {
		try {
			int amount; // Account 클래스에서 입출금 메서드의 return 값을 받아주는 변수. 
			
			Account accountHolder; // 객체 선언
			accountHolder = new Account(); // 인스턴스 객체 생성. 여기서는 java 가 자동으로 empty 생성자를 생성한다. 
			accountHolder.accountNo = "111-222-33333";
			accountHolder.ownerName = "Min";
			accountHolder.balance = 1000;
			
			Account accountHolder2; 
			accountHolder2 = new Account();
			accountHolder2.accountNo = "444-555-66666";
			accountHolder2.ownerName = "Grace";
			accountHolder2.balance = 0;
			
			accountHolder2.deposit(5000);
			accountHolder2.deposit(10000);
			accountHolder2.deposit(20000);
			
			amount = accountHolder2.withdraw(5000);
			System.out.println(accountHolder2.ownerName + "이 찾은 금액은 " + amount + "원 입니다.");
			System.out.println(accountHolder2.ownerName + "의 현재 잔액 " + accountHolder2.balance + "원 입니다.");
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
