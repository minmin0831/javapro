package javapro;

import java.util.Scanner;

public class OperationsEx7 {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.print("시험성적은?");
		int score=sc.nextInt();
		char grade = (score>=90) ?'A':'B'; // 입력 값이 괄호 안에 구문이 참이면 ? 뒤에 나온 문자를 출력하고 거짓이라면 : (콜론) 뒤에 나온 문자를 출력한다. 
//		if(score>=90) {
//			grade='a';
//		}
//		else {
//			grade='b';
//		}
		System.out.println(score + "점은" + grade + "등급입니다."); */
		
		int num1 = 70;
		int num2 = 20; // 두 수중에 큰 수는 20입니다. 
		int biggerNum=(num1>num2)?num1:num2;
		
		System.out.print("두 수중에 큰 수는 " + biggerNum + "입니다.");
	}

}
