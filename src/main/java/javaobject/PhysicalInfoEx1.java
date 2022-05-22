package javaobject;

public class PhysicalInfoEx1 {

	public static void main(String[] args) {
		PhysicalInfo James = new PhysicalInfo("JamesDoe", 10, 130.2f, 35); // 객체 생성과 동시에 초기값 부여. 
		printPhysicalInfo(James);
		
		James.update (11, 145.0f, 45.0f); // update 라는 메서드는 3개의 파라미터를 갖는다. 때문에 이 메서드를 이용하려면 3개의 파라미터를 부여해야 한다. 
		printPhysicalInfo(James);
		
		James.update(12, 157.0f); // 메서드 오버로딩을 이용하여 나이와 키만 업데이트 한다. 
		printPhysicalInfo(James);
		
		James.update(13); // 메서드 오버로딩을 이용하여 나이만 업데이트 한다. 
		printPhysicalInfo(James);
		
	}
	
	// 성장 기록 출력 메서드 
	public static void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println("이름 : " + obj.name);
		System.out.println("나이 : " + obj.age);
		System.out.println("키 : " + obj.height);
		System.out.println("몸무게 : " + obj.weight);
		System.out.println("=========================");
	}

}
