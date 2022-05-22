package javaApplication;

public class APIEx8 {

	public static void main(String[] args) {
		System.out.println(Math.abs(-5)); // 절대값 반환 
		System.out.println(Math.ceil(3.3)); // 올림 
		System.out.println(Math.floor(8.7)); // 버림 
		System.out.println(Math.round(2.5)); // 반올림 (5 이상 반올림) 
		System.out.println(Math.random()); // 0부터 1 사이의 난수(랜덤 숫자) 반환 
		System.out.println(Math.rint(3.5)); // 소수점 첫째 (decimal point 1)까지 반올림. 가까운 정수의 실수값을 유지한다. 
		System.out.println(Math.rint(3.51111)); // 4.0 반환 
		
		int num;
		num = (int)(Math.ceil(3.3));
		System.out.println(num);
		
		System.out.println();
		
		/*
		1. 6개의 숫자를 발생시킨다. 
		2. 같은 값이 있는지 확인하는 알고리즘을 사용한다. 
		 */
		
		// 6개의 정수 배열 생성 
		int[] lotto = new int[6];
		
		boolean check = true;
		
		// true니까 아래 실행 구문을 무한 반복하게 됨. 
		while(check) { 
			// 반복문을 한번만 돌리기 위해 미리 false 를 저장. 
			check = false;
			
		// 로또 번호 6개 선언 
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
		}
		
		for(int a=0; a<lotto.length; a++) {
			for(int b=a+1; b<lotto.length;b++) {
				if(lotto[a] == lotto[b]) {
					/*
					같은 값이 발생하면 true 를 저장하여 while 문을 재반복할 수 있도록 세팅. break 문으로 for 문 탈출하여 while 문 재반복.
					while 문을 계속 재반복하면서 그 중 같은 값이 한번이라도 나온 배열이면 버리고 같은 숫자가 없는 배열만 뽑아내어 출력한다. 
					*/
					check = true;
					break;
					}
				}
			}
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
