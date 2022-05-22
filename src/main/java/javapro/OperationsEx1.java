package javapro;

public class OperationsEx1 {

	public static void main(String[] args) {
		int num=5;
		num=num+10;
		num=num+3;
		
		num++; // num=num+1; 이라는 말이다. 
		
		System.out.println(num);
		
		num--; // 증가 감소 연산자는 항상 단독으로 사용해야 한다. 

		System.out.println(num);
		
		System.out.println(num++);
		// num을 먼저 출력하고 나중에 1이 증가한다.
		
		System.out.println(++num);
		
		// 하지 말아야 할 코드 
		int a=2, b=3, result;
		result = ++a + --b * a--;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("result: " + result);
		// 전위는 먼저 증감을 하고 연산을 하고 후위는 먼저 연산을 하고 그 다음에 증감한다.  
		// 증감연산자는 반드시 단독으로 사용해야 한다. 
		

	}

}
