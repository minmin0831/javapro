package javaobject;

public class Polymorphysm {

	public static void main(String[] args) {
		Account accountHolder = new Account();
		Account accountHolder2 = new CheckingAccount();
		Account accountHolder3 = new DokdoAccount();
		accountHolder3.deposit(30000);
		System.out.println("입금액" + accountHolder3.balance);
		System.out.println("입금액" + accountHolder3.point);

	}

}
