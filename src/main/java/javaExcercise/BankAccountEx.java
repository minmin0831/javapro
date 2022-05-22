package javaExcercise;

import java.util.Scanner;

public class BankAccountEx {
	private static BankAccount[] accountArray = new BankAccount[100];
	private static Scanner scanner = new Scanner(System.in);
	static int count = 0; // accountArray 배열에 계좌를 정리해주고 100개 제한을 처리하기 위해서 생성한 정적 필드. 
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 계죄생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			/*
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}else {
				System.out.println("잘못된 번호를 선택하였습니다. 다시 입력하세요. ");
			}
			*/
			
			switch(selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4: 
				withdraw();
				break;
			case 5: 
				run = false;
				break;
			default:
				System.out.println("잘못된 번호를 선택하였습니다. 다시 입력하세요. "); // 다시 입력할 수 있도록 break; 문을 생략해준다. 
			}
			
		}
		System.out.println("프로그램 종료 ");
	}
	
	// 계좌 생성하기
	private static void createAccount() {
		System.out.println("--------------------");
		System.out.println("1. 계좌생성 ");
		System.out.println("--------------------");
		System.out.println("계좌번호 : ");
		String ano = scanner.next();
		System.out.println("계좌주 : ");
		String owner = scanner.next();
		System.out.println("최초 입금액 : ");
		int balance = scanner.nextInt();
		
		if(count < 100) { // 인덱스 99번, 즉 100개의 bank account를 생성할 수 있도록 허용한다. 
			BankAccount newBankAccount = new BankAccount(ano, owner, balance);
			accountArray[count] = newBankAccount;
			System.out.println("결과 : 계좌가 생성되었습니다. ");
			count++;
		}else {
			System.out.println("해당 은행계좌는 개설이 불가능합니다. ");
		}
		
	}
	
	// 계좌 목록보기
	private static void accountList() {
		System.out.println("--------------------");
		System.out.println("2. 계좌목록 ");
		System.out.println("--------------------");
		for(int i=0; i<count; i++) {
			System.out.println(accountArray[i].getAno() + " " + accountArray[i].getOwner() + " " + accountArray[i].getBalance());
		}
		System.out.println("더 이상 보여줄 계좌정보가 없습니다. ");
		
	}
	
	// 예금하기
	private static void deposit() {
		System.out.println("--------------------");
		System.out.println("3. 예금 ");
		System.out.println("--------------------");
		System.out.println("계좌번호 : ");
		String ano = scanner.next();
		System.out.println("예금액 : ");
		int balance = scanner.nextInt();
		BankAccount bankAccount = findBankAccount(ano); 
		// findBankAccount를 호출하여 입력값으로 받은 계좌번호가 BankAccount [] accountArray 배열에 저장되어 있는지 순회 요청하여 일치하는 bankAccount의 배열이 있으면 해당 배열을 bankAccount 객체에 저장하여 그것을 반환. 
		if(bankAccount == null) {
			System.out.println("결과: 계좌가 없습니다. ");
		}else {
			bankAccount.setBalance(bankAccount.getBalance() + balance);
			System.out.println("결과: 입금이 성공되었습니다. ");
		}
	}
	
	// 출금하기
	private static void withdraw() {
		System.out.println("--------------------");
		System.out.println("4. 출금 ");
		System.out.println("--------------------");
		System.out.println("계좌번호 : ");
		String ano = scanner.next();
		System.out.println("출금액 : ");
		int balance = scanner.nextInt();
		BankAccount bankAccount = findBankAccount(ano);
		if(bankAccount == null) {
			System.out.println("결과: 계좌가 없습니다. ");
		}else {
			if(bankAccount.getBalance() < balance) {
				System.out.println("출금액이 예금액을 초과합니다. ");
			}else if(bankAccount.getBalance() < 0) {
				System.out.println("출금이 불가합니다. ");
			}else {
				bankAccount.setBalance(bankAccount.getBalance() - balance);
				System.out.println("결과: 출금이 성공되었습니다. ");
			}
			
		}
	}
	
	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static BankAccount findBankAccount(String ano) { 
		BankAccount bankAccount = null; // BankAccount 객체 생성하고 일단은 null 값을 저장. 아래 for문 돌려서 계좌번호 일치하는 bankAccount(accountArray[i])를 찾으면 해당 bankAccount를 반환. 
		for(int i=0; i<count; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				bankAccount = accountArray[i];
				break;
			}
		}
		return bankAccount;
	}

}
