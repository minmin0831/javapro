package javaobject;

public class NestedClass1Ex {

	public static void main(String[] args) {
		NestedClass1 nestedClass1 = new NestedClass1(1, "One");
		NestedClass1.NestedClass2 nestedClass2 = nestedClass1.new NestedClass2(2, "둘");
		
		System.out.println(nestedClass1.num);
		System.out.println(nestedClass1.spellingNum);
		System.out.println(nestedClass2.num);
		System.out.println(nestedClass2.spellingKorNum);
	}

}
