package javaobject;

public class AccountEx1 {

	public static void main(String[] args) {
		try {
			
			int amount; // 이 클래스에서 deposit과 withdraw 의 return 값을 받을 수 있도록 변수를 선언한다.
			
			
			Account accountHolder3 = new Account("222-222-22222", "JohnDoe", 0); // Account 라는 객체에 인스턴스 객체 생성. Account 라는 클래스와 같은 패키지에 있어서 따로 import를 하지 않아도 된다. 
			Account accountHolder4 = new Account("111-111-11111", "JaneDoe", 5000);
			
			System.out.println(Account.BANKNAME); // final static 필드값을 호출하려면, 생성자가 없기 대문에 생성자 객체.메소드명 or 필드명으로 접근하지 않고 클래스명.필드명으로 접근한다. 
			
			amount = accountHolder3.deposit(10000); 
			
			System.out.println("입금인 이름 : " + accountHolder3.ownerName);
			System.out.println("입금액 : " + amount);
			System.out.println("=============================");
			accountPrint(accountHolder3);
			
			amount = accountHolder4.deposit(30000);
			
			System.out.println("입금인 이름 : " + accountHolder4.ownerName);
			System.out.println("입금액 : " + amount);
			System.out.println("=============================");						
			accountPrint(accountHolder4);
			// depositPrint(accountHolder4);

			amount = accountHolder3.withdraw(3000);
			
			System.out.println("출금인 이름 : " + accountHolder3.ownerName);
			System.out.println("출금액 : " + amount);
			System.out.println("=============================");		
			accountPrint(accountHolder3);
			// withdrawPrint(accountHolder3);
			
			amount = accountHolder3.withdraw(5000);
			
			System.out.println("출금인 이름 : " + accountHolder3.ownerName);
			System.out.println("출금액 : " + amount);
			System.out.println("=============================");			
			accountPrint(accountHolder3);
			// withdrawPrint(accountHolder3);
			
			// 명시적 선언 
			Account accountHolderUnknown; // >> 객체 변수 선언.  
			int num; // >> 일반 변수 선언.  
			
			// 익명 객체 생성. 데이터 타입이 객체 타입 (클래스 등) 이고 변수가 지정되지 않을 경우, 이것을 익명 객체라고 한다. 이 객체는 변수만 부재할 뿐, 출력하는 일 등에 정상적인 객체로 사용 가능하다. 
			accountPrint(new Account("555-777-88888", "Park", 500000));
			
			new Account();
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	// 출력 메서드
	public static void accountPrint(Account balance) {
		System.out.println("은행이름 : " + Account.BANKNAME);
		System.out.println("계좌번호 : " + balance.accountNo);
		System.out.println("예금주 이름 : " + balance.ownerName);
		System.out.println("잔액 : " + balance.balance);
		System.out.println("=============================");
		}
	
	}
