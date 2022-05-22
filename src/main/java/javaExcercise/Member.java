package javaExcercise;

public class Member {
	private String name;
	private String id;
	private String password;
	private int age;
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public Member() {
		
	}

	public void setPassword(String password) {
		this.password = password;		
	}
	
	public String getPassword(String id) {
		String pwCapsule;
		String pwHint = this.password.substring(0, 5);
		String asteriskValue = "";
		String[] asterisked = new String[this.password.length()-5];
		for(int i=0; i<this.password.length()-5; i++) {
			asteriskValue += "*";
		}
				
		pwCapsule = pwHint + asteriskValue;
		System.out.println("Your password is " + pwCapsule);
		return pwCapsule;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge(String id) {
		System.out.println("The user's age is " + this.age);
		return age;
	}
	
	public boolean login(String id, String password) {
		if(id.equals(this.id) && password.equals(this.password)) {
			System.out.println("로그인되었습니다. ");
			return true;
		}
		System.out.println("로그인 정보가 잘못되었습니다. ");
		return false;
	}
	
	public void logout(String id) {
		System.out.println("로그아웃되었습니다. ");
	}
}
