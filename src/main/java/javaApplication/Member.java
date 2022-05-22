package javaApplication;

public class Member implements Cloneable{
	// 필드 생성 
	public String id;
	public String name;
	public String pw;
	int[] scores; // 배열 객체가 있을 때는 다음과 같은 "얕은 복제"는 사용하면 안된다. 
	public int age;
	
	// 생성자 생성 
	public Member(String id, String name, String pw, int age) {
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.age = age;
	}
	
	// 메서드 생성 >> Member 라는 개체 자체도 return 할 수 있다. clone() 은 "얕은 복제"이다. 
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone(); // Cloneable 인터페이스에서 제공하는 메서드. 
		} catch (CloneNotSupportedException e) {
			return cloned;
		}
		return cloned;
	}
}
