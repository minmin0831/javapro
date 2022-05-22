package javaApplication;

public class ExceptionEx1 {

	public static void main(String[] args) {
		/*
		try {
			String data = null;
			System.out.println(data.toString());
		} catch(NullPointerException e) {
			System.out.println("객체 참조가 없는 상태입니다.");
		}
		*/
		
		try {
			int nums[]  = {10, 20, 30}; // 배열 상 인덱스 0, 1, 2 에만 배열값이 저장되었기 때문에 nums 배열의 인덱스 3에는 저장된 배열값이 없기 때문에 예외처리 실행 구문이 실행된다. 
			System.out.println(nums[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 초과했습니다. ");
			
			/*
			앱 테스트 시 발생한 에러 메시지가 발생한다면, 해당 에러 메시지를 받아 예외처리를 해주어야 한다. 이것을 핸들링이라고 한다. 
			개발 단계에서 개발자는 모든 에러 시나리오에 대해 고려할 수 없다. 때문에 배포 전에 베타 테스트가 필요하다. 
			 */
		}
		
		String str1 = "123";
		String str2 = "456a";
		String str3 = "789";
		
		try {
			System.out.println("문자열 연결 : " + str1 + str2);
			System.out.println("정수로 parsing 하여 연산 : " + Integer.parseInt(str1) + Integer.parseInt(str2));
			System.out.println("정수로 parsing 하여 연산 : " + Integer.parseInt(str1) + Integer.parseInt(str3)); // 수행 안됨. 앞 전 라인에서 에러가 났기 때문에 catch 구문으로 넘어간다. 
			
			// 예외가 발생하지 않았을 때 
		} catch(NumberFormatException e) {
			System.out.println("수치로 변환할 수 없습니다. ");
			
			// 예외가 발생하였을 때 
		} finally {
			System.out.println("예외처리 수업입니다. ");
			
			// 네트워크에서 연결했다가 갑자기 통신이 끊길 때 혹은 예외처리가 발생하였든 안하였든 간에 무조건 발생시키는 실행 구문을 finally 라고 한다. 
		}
		
	}

}
