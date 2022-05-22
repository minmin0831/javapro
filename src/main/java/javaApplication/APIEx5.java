package javaApplication;

import java.util.regex.Pattern;

public class APIEx5 {

	public static void main(String[] args) {
		// 정규 표현식 : 문자열("...")로 정해져있는 표현식. 이메일이나 전화번호 등 정보가 올바르게 입력되었는지 확인하기 위해 정규 표현식을 사용한다. 
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; // "|" 는 or 또는 필터링 역할을 한다. 	(중간 중간에 띄어쓰기를 하지 않는다.)  	
		String tel = "010-777-8989";
		boolean result = Pattern.matches(regExp, tel); // Pattern 은 자바에서 제공하는 검증 클래스이다. 
		if(result) {
			System.out.println("올바른 전화번호입니다. "); // result 변수가 true 를 받으면 이것을 DB로 넘긴다.  
		}else {
			System.out.println("전화번호 형식이 아닙니다. "); 
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; // 마지막 (\\.\\w+)?은 이 부분은 있을 수도 있고 없을 수도 있다는 의미이다. 
		String email = "abc@naver.com";
		result = Pattern.matches(regExp, email);
		if(result) {
			System.out.println("올바른 이메일 주소입니다. ");
		}else {
			System.out.println("이메일 형식이 아닙니다. ");
		}
	}

}
