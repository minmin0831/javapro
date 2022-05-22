package javaobject;

public class CheckEx1 {

	public static void main(String[] args) {
		try {
			CheckingAccount accountHolder3 = new CheckingAccount("222-222-22222", "JohnDoe", 1000, "1111-2222-3333-444");
			accountHolder3.deposit(50000);
            accountPrint(accountHolder3);
			
			
			int pay = accountHolder3.pay("1111-2222-3333-444", 40000);
			System.out.println("지불액 : " + accountHolder3.amount);

			
			/*
			accountHolder3.withdraw(60000);
			System.out.println("지불액 : " + accountHolder3.withdrawAmount);
			
			accountHolder3.cardNo("1111-1111-3333-444");
			System.out.println("카드번호  : " + accountHolder3.withdrawAmount);
			*/
			


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
	}
	
	public static void accountPrint(Account obj) {
		System.out.println("은행이름 : " + Account.BANKNAME);
		System.out.println("계좌번호 : " + obj.accountNo);
		System.out.println("예금주 이름 : " + obj.ownerName);
		System.out.println("잔액 : " + obj.balance);
		System.out.println("=============================");
		}

}
