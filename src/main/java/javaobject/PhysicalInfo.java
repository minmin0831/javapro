package javaobject;

public class PhysicalInfo {
	String name;
	int age;
	float height, weight;
	
	// 생성자는 별도의 외부 클래스를 만들지 않았으면 클래스 이름이 될 수도 있다. 
	public PhysicalInfo(String name, int age, float height, float weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// 메서드 오버로딩 = 동일한 이름을 가진 메서드를 여러개 만드는 것을 말한다. 
	// 조건 1. 일단 매개변수 갯수가 달라야 한다. 
	// 조건 2. 매개변수의 타입이 달라야 한다. 중복된 타입이 있는 경우, 에러가 나올 수 있다. 이럴 경우 메서드 이름에 특별한 성격을 부여하여 메서드를 생성한다. 
	void update(int age, float height, float weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	void update(int age, float height) {
		this.age = age;
		this.height = height;
		
	}
	
	void update(int age) {
		this.age = age;
		
	}
	
	
}
