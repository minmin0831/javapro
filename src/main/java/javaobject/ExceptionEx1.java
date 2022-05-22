
package javaobject;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			int num1 = 45;
			int num2 = 0;
			int result;
			result = num1/num2;
			System.out.println("계산결과 = " + result);
			
		} catch(ArithmeticException e) { // 불능으로 인한 예외처리. 이에 대비되는 개발자의 의도적인 예외처리도 할 수 있다. 
			
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
	}

}
