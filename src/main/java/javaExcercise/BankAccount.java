package javaExcercise;

// 한 개의 bankAccount 계정을 생성할 수 있고 계정 정보를 getter와 setter를 이용해 입력/호출이 가능하다. 
public class BankAccount {
	private String ano;
	private String owner;
	private int balance;
	
	public BankAccount(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
