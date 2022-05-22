package javaApplication;

public class ContainerEx2 {

	public static void main(String[] args) {
		Container<String, String> container1 = new Container<String, String>();
		
		// container 객체는 배열처럼 보이는 여러 데이터를 하나의 객체에 모두 담는다. 
		container1.set("Matt Daymon", "Actor");
		String name1 = container1.getKey();
		String occupation = container1.getValue();
		System.out.println("name : " + name1 + "\n" + "occupation : " + occupation);
		
		System.out.println();
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("Matt Daymon", 35);
		String name2 = container2.getKey();
		Integer age = container2.getValue();
		System.out.println("name : " + name2 + "\n" + "age : " + age);
		
		
	}

}
