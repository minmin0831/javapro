package javaApplication;

public class APIEx4 {
	public static void main(String[] args) {
		// StringBuilder 객체 생성. 원본 객체를 잠시만 사용하고 끝낼 때 사용. 
		StringBuilder sb = new StringBuilder();
		sb.append("우리 모두 "); // 문자열을 더한다. 
		sb.append("파이팅");
		System.out.println(sb.toString());
		
		sb.insert(5, " 다같이"); // 문자열을 삽입한다. 
		System.out.println(sb.toString());
		
		sb.setCharAt(10, '화'); // 문자를 수정한다. 
		System.out.println(sb.toString());
		
		sb.replace(6, 9, "아자아자"); // 문자열을 수정한다. 
		System.out.println(sb.toString());
		
		sb.delete(6, 11);
		System.out.println(sb.toString());
		
		System.out.println(sb.length()); // 지금까지 sb 에 저장된 문자열의 길이 출력. 
		
		String result = sb.toString();
		System.out.println(result);
	
	}
}
