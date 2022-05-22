package arrayEx;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
				System.out.println(args[0] + args[1]); // Run configuration에서 arguments > program arguments 에 값을 입력하면 space 를 기준으로 배열 값이 하나씩 생겨난다. 
		 */
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]); 
		System.out.println("두 수의 합 =" + args[0] + args[1]); // args[0] 과 args[1] 은 각각 문자열로 인식되어 문자로 출력된다. 
		System.out.println("두 수의 합 =" + num1 + num2); // args[0] 과 args[1] 가 Integer.parseInt 를 통해 문자열 타입이 정수 타입으로 변환된다. 하지만 별다른 조치가 없으면, args 변수는 그냥 문자열로 인식이 되어 문자열로써 출력된다. 
		System.out.println("두 수의 합 =" + (num1 + num2)); // 정수로 변환된 것이 소괄호()를 통해 문자열이 정수로 인식될 수 있도록 조치한다. 

		

	}

}
