package javaobject;
// 은행 계좌 클래스 
public class Account { // 클래스에 final 을 붙여주면 클래스 내 필드와 메서드 사용은 가능하나, 상속은 불가하다. 
	// 필드 
	final static String BANKNAME = "Scotia Bank"; // static final 로 써도 상관없음. 관습적으로 상수는 대문자로 쓴다. final access controller 가 붙으면 그 뒤는 상수처리 된다. 
	String accountNo; // 계좌번호
	String ownerName; // 예금주 이름
	int balance; // 잔액
	int amount; // 입출금액 
	int point; // 포인트 
	
	// 생성자
	public Account(String accountNo, String ownerName, int balance) { // 개발자가 직접 생성자를 만들어주었기 때문에 이전에 empty 생성자를 만들어 필드값을 지정했던 부분에서 에러가 난다. 
		this.accountNo = accountNo; // this 는 내부 필드값을 의미한다. 
		this.ownerName = ownerName;
		this.balance = balance;
	}
		
	// empty 생성자 에러 해결
	public Account() {
		// empty 생성자를 만들어 놓아, java가 자동으로 empty 생성자를 만들지 않아도 실행 java 파일에서 기존 코드에서 해당 생성자를 호출할 수 있도록 한다. 
	}
	
	
	// 예금 메서드
	int deposit(int amount) { // 메서드 이름 앞 자리는 메서드 타입인데, 리턴 타입이 중요하지 않을 경우라면 타입을 딱히 지정하지 않아도 된다. 이 경우 void 라고 쓴다. 
		balance += amount; 
		return amount;
	}
	
	// 출금 메서드
	// 메서드에 final 을 붙여주면 다른 클래스에서 호출하여 사용이 가능하지만 Overriding 이 불가하다. 
	int withdraw(int amount) throws Exception {
		if(balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance -= amount;
		return amount;
	}
	
	

}
