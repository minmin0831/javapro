package javapro;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("여행지를 선택하세요. (1.유럽 2.미주 3.동남아) ->");
		int choice = sc.nextInt();
		
		switch(choice) { // if (else) 문과 switch 문은 같은 기능을 구현할 수 있다. 
		case 1:
			System.out.println("1층 안내데스크로 가세요.");
			break;
		case 2:
			System.out.println("2층 안내데스크로 가세요.");
			break;
		case 3:
			System.out.println("별관 안내데스크로 가세요.");
			break;
		default: // 위의 값 중 어느 것에도 해당되지 않는 값을 입력한 경우 default를 출력한다. 
			System.out.println("여행지 선택이 잘못되었습니다.");
		} 
		
	} 

} 
