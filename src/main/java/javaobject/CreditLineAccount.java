package javaobject;

public class CreditLineAccount extends Account { // 마이너스 통장 클래스: 일반통장과 같이 예금을 할 수 있다. 이것은 대출금 상환으로 쓰이기도 한다. 0원 미만이어도 출금이 가능하다. 어느 정도까지만. 
	int creditLine; // 대출한도 (마이너스 100만원 까지 출금이 가능한 계좌이다.)
	
	// 생성자 
	public CreditLineAccount (String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
		
	}
	
	public CreditLineAccount () {
		// empty 생성자 
	}
	
	/*
	 메서드 오버라이딩 (재정의). 이하의 실행문은 부모 클래스의 메서드를 무시하고 CreditLineAccount 클래스에서 수정한 메서드를 사용하겠다는 명령어이다. 
	 오타도 방지할 수 있다. 
	 */
	
	@Override 
	int withdraw (int amount) throws Exception { // deposit 메서드는 Account 클래스의 메서드를 그대로 사용. 다만 withdraw 메서드만 재정의(Overriding) 하여 사용한다. 
		if((balance+creditLine) < amount) {
			throw new Exception("출금 한도를 초과하였습니다. ");
		}
		balance -= amount;
		return amount;
	}

}
