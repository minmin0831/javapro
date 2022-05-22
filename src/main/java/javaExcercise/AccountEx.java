package javaExcercise;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account("111-222-333", "홍길동", 5000);
		System.out.println("현재잔고 : " + account.getBalance());
		
		account.setBalance(1000);
		System.out.println("현재잔고 : " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재잔고 : " + account.getBalance());

		account.setBalance(200000);
		System.out.println("현재잔고 : " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재잔고 : " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재잔고 : " + account.getBalance());
	}

}
