package javaApplication;

public class APIEx2 {

	public static void main(String[] args) {
		String str1 = "프로그램 개발 응용";
		// substring() 메서드: 3부터 5까지의 문자열을 출력한다. 
		String subStr = str1.substring(3,6);
		System.out.println(subStr);
		
		// substring() 메서드: 5부터 끝까지 문자열을 출력한다. 
		String subStr2 = str1.substring(5);
		System.out.println(subStr2);
		
		String residenceId = "123456-1234567";
		String residenceId1 = residenceId.substring(0,7) + "*******";
		System.out.println(residenceId1);
		
		// trim() 메서드: 좌우 공백을 제거한 문자열을 변수에 저장. (단순하지만 많이 사용하는 메소드) +
		String str3 = "      우리모두 파이팅      " + "   !   "; // 두 개 이상의 다른 문자열을 합쳐 변수에 저장하는 경우는 첫번재 문자열만 trim() 메서드가 적용된다. 
		String newStr3 = str3.trim();
		System.out.println(str3);
		System.out.println(newStr3);
		
		// valueOf() 메서드: String 이 아닌 모든 데이터 타입을 String(문자열)로 변환. Integer.parseInt() 와는 반대 개념. 
		String str4 = String.valueOf(10.63);
		System.out.println(str4);
		
		// split() 메서드: 어떤 기호 (예를 들어 콤마(,))를 기준으로 문자열을 나누어 배열 변수에 배열값으로 저장한다. 
		String text = "David, John, James, Jessy, Rachael";
		String names[] = text.split(" & |, | - "); // or 기호(|)를 통해 여러 가지 기호를 입력할 수도 있다. 
		System.out.println(names[1]);
		
	}

}
