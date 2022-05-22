package javaobject;

public class CreditLineAccountEx1 {

	public static void main(String[] args) {
		try {
			CreditLineAccount accountHolder3 = new CreditLineAccount ("222-222-22222", "JohnDoe", 100, 1000);
			
			int amount = accountHolder3.withdraw(1000);
			System.out.println("인출액 : " + amount);
			System.out.println("잔액 : " + accountHolder3.balance);
			System.out.println("마이너스 한도 : " + accountHolder3.creditLine);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
