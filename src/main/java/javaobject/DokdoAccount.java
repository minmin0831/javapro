package javaobject;

public class DokdoAccount extends Account {
	int point = 0;
	
	// 생성자
	public DokdoAccount(String accountNo, String ownerName, int balance) {
		super(accountNo, ownerName, balance);
	}
	
	public DokdoAccount() {
		
	}
	
	@Override
	int deposit(int amount) {
		super.deposit(amount); // 메서드에서 처리하는 계산식을 가져온다. 
		point = (int)(amount * 0.001);
		return amount;
	}
}
