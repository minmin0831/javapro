package javaApplication;

public class APIEx7 {

	public static void main(String[] args) {
		// 일반 변수 
		int num1 = 50;
		System.out.println(num1);
		
		// 참조 변수 
		Integer intNum1 = new Integer(50); // heap 안에 정수 50을 boxing 하여 저장한다. intNum1 변수에는 주소값이 들어있다. 
		// intNum1 = 70; // 주소값이 정수 70으로 변경되어 버린다. intNum1에 저장된 Integer 객체는 삭제된다. 
		int num2 = intNum1.intValue(); // unboxing 이다. Integer 객체를 보존하고 그 안에 있는 정수값만 num1에 저장한다. 
		System.out.println(num2); // 하지만 요즘은 이렇게 unboxing 하지 않는다. 
		
		// 참조 변수 (요즘 방식)
		Integer intNum2 = 100; // new 연산자로 객체 인스턴스를 만들지 않아도 자동 boxing 처리한다. 
		System.out.println(intNum2);
		
		String str = "안녕";
		System.out.println(str);
		
		String[] strArray = {
				"가나", "초콜릿"
		};
		System.out.println(strArray[0] + " " + strArray[1]);
		
		String num3 = "30";
		String num4 = "50";
		System.out.println((Integer.parseInt(num3)) + (Integer.parseInt(num4)));
		
		String str2 = "가나";
		int num5 = 30;
		int num6 = 50;
		System.out.println(str2 + num5 + num6); // 문자열 타입과 정수 타입을 괄호 구분없이 더하면 정수 타입을 문자열 타입으로 강제변환하여 출력한다. 
		System.out.println(str2 + (num5 + num6)); // 정수를 괄호로 구분하여주면 문자열 타입과 함께 출력 시 괄호가 데이터 타입을 유지시켜준다. 
	}

}
