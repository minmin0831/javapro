package javaobject;

public class SingletonEx {

	public static void main(String[] args) {
		// Singleton person1 = new Singleton();
		
		Singleton person2 = Singleton.getInstance();
		Singleton person3 = Singleton.getInstance();
		if(person2 == person3) {
			System.out.println("같은 사람입니다.");
		} else {
			System.out.println("다른 사람입니다.");
		} // 같은 클래스인 Singleton 을 참조하기 때문에 person2 와 person3 이 같은 값일 수 밖에 없다. 참조 주소가 동일, 저장 값이 동일. 

	}

}
