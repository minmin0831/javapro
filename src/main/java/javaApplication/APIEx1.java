package javaApplication;

public class APIEx1 {

	public static void main(String[] args) {
		String str1 = "안녕하세요. ";
		System.out.println(str1);
		System.out.println(str1.toString());
		
		String str2 = new String("안녕하세요. ");
		System.out.println(str2);
		
		String str3 = "우리 모두 파이팅.";
		char chval = str3.charAt(6); // charAt 메서드는 파라미터로 들어온 "문자의 위치"를 찾을 때 사용한다. String 내 문자 위치는 배열[0]부터 시작한다. 
		System.out.println(chval);
		
		// 같은 문자열 주소를 비교. 변수에 같은 주소 저장. 
		String str4 = "John Doe";
		String str5 = "John Doe";
		
		if(str4 == str5) {
			System.out.println("str 4와 str5가 같은 객체 참조 ");
		} else {
			System.out.println("str 4와 str5가 다른 객체 참조 ");
		}
		
		// 다른 객체가 다른 주소를 갖게 된다. 변수에도 다른 주소 저장. 
		String str6 = new String("John Doe");
		String str7 = new String("John Doe");
		
		if(str6 == str7) {
			System.out.println("str 6와 str7가 같은 객체 참조 ");
		} else {
			System.out.println("str 6와 str7가 다른 객체 참조 ");
		}
		
		// equals() 메서드를 사용하면 변수에 저장된 주소를 비교하는 것이 아닌, 주소에 저장된 실제 저장 문자열을 문자열 대 문자열로 비교한다. 
		String str8 = new String("John Doe");
		String str9 = new String("John Doe");
		
		if(str8.equals(str9)) {
			System.out.println("str 8와 str9가 같은 객체 참조 ");
		} else {
			System.out.println("str 8와 str9가 다른 객체 참조 ");
		}
		
		// indexOf() 메서드: 검색 문자열에서 해당 문자열이 시작된 위치를 변수에 저장한다. 
		String str10 = "코로나 박멸"; // 객체 1개
		int index = str10.indexOf("코로나"); // 해당 index의 시작 위치를 반환  
		int index2 = str10.indexOf("박멸");
		int index3 = str10.indexOf("메르스");
		System.out.println(index);
		System.out.println(index2);
		// 찾는 문자열이 존재하지 않을 경우, -1을 출력한다. 
		System.out.println(index3);
		System.out.println(str10.length()); // 변수에 저장된 문자열 주소를 찾아 실제 저장된 문자열의 길이를 찾는다. 
		
		// replace() 메서드: 원본 String에 저장된 문자열을 변경하는 겻이 아닌, 문자열이 변경된 String 객체를 만들어 변수에 저장한다. 
		String newStr10 = str10.replace("코로나", "Covid-19"); // 객체 2개 
		System.out.println(newStr10);
		System.out.println(str10);
		
		// StringBuffer 를 사용하면 중복 클래스 객체 생성을 방지할 수 있다. 
		// StringBuilder 
		
	}

}
