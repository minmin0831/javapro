package classEx;

public class ComputerExample {

	public static void main(String[] args) { // return 을 void 로 지정하였기 때문에, return type도 존재하지 않는다. 따라서 return 문이 올 수 없다. 
		Computer myCom = new Computer();
		
		/*
		매개변수의 수를 모를 경우, 클래스 객체에서 int sum1(int[] values) 와 같이 선언한 후, result1과 result2와 같은 방법으로 배열 값을 지정해준다. 
		Computer 객체 생성 후 myCom 참조 변수를 선언한다. 
		 */
		
		int[] values = {1, 2, 3}; // 배열 변수 values 에 {1, 2, 3} 으로 배열값의 초기값을 넣어준다. int sum1(int[] values) 형태로 배열 매개변수를 저장한 필드가 sum1 이기 때문에 sum1 에 배열 형태의 매개변수로 저장된다. 
		int result1 = myCom.sum1(values); // 참조 변수 myCom으로 sum1 클래스 변수 (필드)를 result1의 변수값으로 저장한다. 
		System.out.println("result1: " + result1); // result1의 값을 출력한다. 
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5}); // 참조 변수 myCom으로 sum1 클래스 변수 (필드)를 호출하여 변수 (필드) 값을 바꾸고 result2의 변수값으로 저장한다. 
		System.out.println("result2: " + result2); 
		
		int result3 = myCom.sum2(1, 2, 3); // 위의 방법과 달리, int sum2(int ... values) 형태로 배열 매개변수를 저장하면, 비교적 간편하게 sum2 클래스 변수 (필드) 값을 변경할 수 있다. 
		System.out.println("result3: " + result3); 
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4: " + result4);

	}

}
