package javaobject;

public class CheckingAccount extends Account {
	String cardNo; // 카드
	
	// 생성자
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		/*
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance; // 상속받은 것이기 때문에 굳히 일일이 넣지 않아도 된다. 
		*/ 
		super(accountNo, ownerName, balance); // super 메서드 (부모 생성자 호출)를 이용해 클래스 필드를 초기화할 수 있도록 해준다. 
		this.cardNo = cardNo; 
	}
	public CheckingAccount() {
		
	}
	
	// 체크카드 입력 메서드
	
	String cardNo(String cardNo) {
		cardNo.equals(cardNo);
		return cardNo;
	}
	
	// 체크카드 결제 메서드 
	int pay(String cardNo, int amount) throws Exception {
		
		if (!this.cardNo.equals(cardNo)) { // Account 클래스에서 잔액 부족 시나리오에 대해 예외처리를 하였기 때문에 && balance <= withdrawAmount 는 조건문에서 생략해도 상관없다. 
			throw new Exception("등록되지 않은 카드입니다. ");
		}
		balance -= amount;
		return amount;
	}

}
