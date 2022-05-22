package arrayEx;

public class ArrayEx7 {

	public static void main(String[] args) {
		/*
		String[] strArray = new String[5];
		strArray[0] = "Steve";
		strArray[1] = "John";
		System.out.println(strArray[1]);
		*/
		
		int num1 = 70;
		int num2 = 150;
		int temp;
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		/*
		num1과 num2의 값을 바꿔치기하여 저장하여 출력하는 방법으로 temp 라는 임시 변수를 만들어 이곳에 num1을 저장하고 
		num1 값을 num2로 업데이트하고 temp에 있던 num1 값을 num2에 저장한다. 
		 */
		
		System.out.println(num2 + "====" + num1);
		
	}

}
