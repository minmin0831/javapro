package javaobject;

public class NestedClass1 {
	int num;
	String spellingNum;
	
	public NestedClass1(int num, String spellingNum) {
		this.num = num;
		this.spellingNum = spellingNum;
		System.out.println(this.num + " : " + this.spellingNum);
	}
	
	class NestedClass2 {
		int num;
		String spellingKorNum;
		
		public NestedClass2(int num, String spellingKorNum) {
			this.num = num;
			this.spellingKorNum = spellingKorNum;
			System.out.println(this.num + " : " + this.spellingKorNum);
		}
	}
}
