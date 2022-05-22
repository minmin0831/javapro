package javapro;

public class ReferenceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=25;
		int num2=20;
		if (num1 == num2) {
			System.out.println("두 수는 같은 값 입니다.");
		} else {
			System.out.println("두 수는 다른 값 입니다.");
		}
		
		// 일반 문자열 변수 
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		if (str1 == str2) { // stack 영역에 저장된 "주소"로만 비교한다.  
			System.out.println("참조하는 주소가 같습니다. ");
		} else {
			System.out.println("참조하는 주소가 틀립니다. ");
		}
		
		if (str1.equals(str2)) { // heap 영역에 저장된 "문자열"을 가져와서 해당 문자열들을 비교한다. 
			System.out.println("같은 문자열 입니다. ");
		} else {
			System.out.println("다른 문자열 입니다. ");
		}
		
		// String 객체 변수
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		
		if (str3 == str4) { // stack 영역에 저장된 주소로만 비교한다.  
			System.out.println("참조하는 주소가 같습니다. ");
		} else {
			System.out.println("참조하는 주소가 틀립니다. ");
		}
		
		if (str3.equals(str4)) { // heap 영역에서 문자열을 가져와서 문자열을 비교한다. 
			System.out.println("같은 문자열 입니다. ");
		} else {
			System.out.println("다른 문자열 입니다. ");
		}

	}

}