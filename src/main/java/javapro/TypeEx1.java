package javapro;

public class TypeEx1 {

	public static void main(String[] args) {
		
		char ch=65; // 한 개의 문자만 받을 수 있다. 두 개 이상의 문자는 에러. 
		char han=44032;
//		int num=2.3;
		double num=2.3;
//		float num=2.3; // error: double과 float의 지수와 가수부가 상이하기 때문에 기본 double type의 실수를 float에 끼워넣을 수 없다. 때문에 실수 끝에 f를 붙여준다. 
//		float num=2.3f; 
		boolean bool=false;
		
		System.out.println(bool);
		System.out.println(5>10);
		
		
		boolean stop=false;
		if(stop) { // 기본 if 문. 
			System.out.println("중지합니다.");
			
		}
		
		else {
			
			System.out.println("시작합니다.");
			
		}
		
		
		/* 
		 * data type을 선택할 때는 데이터의 크기에 따라 적절한 data type을 사용한다. 하지만 요즘 컴퓨터는 메모리 성능이 평균 상향되어 보통은 int를 사용한다. 
		 * int 는 약 음수와 양수로 21억 정도 표시할 수 있다. 
		 * 하지만 그 이상의 숫자를 넣기 위해서는 long 을 사용한다. 
		 * 
		 * 변수에만 type 이 있는 것이 아니라, 숫자에도 type 이 있다. 
		 * 소수점이 없으면 숫자 자체가 정수형이며 int 가 최고 큰 type 이기 때문에 이것보다 큰 숫자 끝에는 L 을 붙여주어야 한다. long 은 trillion, quadrillion 이상을 커버한다. 
		 * char 도 정수이다. 모든 글자가 이진법으로 표시되어 관리되고 있기 때문이다. 
		 * 
		 * 컴퓨터에는 문자 또는 숫자만 유효하다고 생각한다. 나머지는 인위적으로 만들어낸 것이다. 
		 * 날짜도 모두 컴퓨터에는 숫자로 기록되어있다. 
		 * 시작하는 날짜는 1로 인식하고 비교하는 날짜를 해당 일부터 날짜를 계산하여 인식한다. 
		 * 
		 * Java는 객체 지향 프로그래밍 언어이다. 
		 */
	}

}
