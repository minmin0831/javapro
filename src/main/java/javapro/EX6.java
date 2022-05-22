package javapro;

public class EX6 {
	public static void main(String[] args) {
		int amount=10;
		int price=3000;
		String memo="";
		
		if(amount>=10) {
			price=(int)(price*0.8); // 0.8 이 실수이기 때문에 이대로 출력하면 에러가 뜬다. 때문에 여기서는 data type 변화를 해줘야 한다. int 로 변화하여 에러가 출력되지 않도록 한다. 
			memo="(할인가)";
		}
		
		int sellingPrice=amount*price; // Java 프로그램은 코드 순서대로 읽기 때문에 if 문 뒤에 계산식이 온다. 
		System.out.println("Totla Amout:" + sellingPrice + memo); // 변수에는 사용범위가 있다. 선언된 블록 내에서만 사용이 가능하다. 
		
		
		/*
		 * int 에는 지수와 가수가 없기 때문에 소수점을 입력하면 에러가 난다. 
		 * 문자 출력 시 " " 를 사용하지 않으면 변수로 보기 때문에 문자를 인식하지 못하여 문자를 출력하지 못한다. 
		 
		 * 프로그래밍을 배우는 이유는 제어문을 작성하기 위함이다. 
		 * if 문 이 가장 쉬우면서 가장 해결하기 힘든 제어문이다. 
		 
		 * 문제)
		 * 수량과 단가를 입력받아 판매금액을 구하시오. 
		 * 조건 1) 수량이 10개 이상이면 20%할인가를 적용하시오. 
		 * 
		 * 산술연산자: + - * / %
		 * 비교연산자: > >= < <= == !=
		 
		 * 변수마다 기억장소가 다르다. 
		 */
		
	}
}


