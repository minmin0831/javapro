package javaExcercise;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
		// this.name = name; // Parent를 상속받았는데 이렇게 필드갑 저장을 시켜주면 에러가 난다. 부모를 가리키는 super() 메서드를 사용해주어야 한다. 
		super(name);
		this.studentNo = studentNo;
	}
	
}
