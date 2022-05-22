package javaExcercise;

public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	private int balance;
	
	String num;
	String name;
	int amount;
	
	public Account(String num, String name, int balance) { // balace가 private으로 선언되었더라도, 생성자 파라미터로 balance를 입력하여 초기화할 수 있다. 
		this.num = num;
		this.name = name;
		this.balance = balance;
	}
	
	public Account() {
		
	}
	
	void deposit(int amount) {
		do {
			balance += amount;
		} while(balance >= MIN_BALANCE && balance <= MAX_BALANCE);
	}
	
	int withdraw(int amount) {
		do {
			balance -= amount;
			return balance;
		} while(balance >= MIN_BALANCE && balance <= MAX_BALANCE);
	}
	
	void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}else {
			System.out.println("잔액이 0원 미만이거나 100만원을 초과합니다. ");
		}
		
	}
	
	int getBalance() {
		return balance;
	}
}
