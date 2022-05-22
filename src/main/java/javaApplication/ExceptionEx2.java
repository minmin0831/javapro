package javaApplication;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		try {
			int num = 10;
			int num2 = 0;
			System.out.println(num/100);
			System.out.println(num2/2.0);
		} catch(Exception e) {
			System.out.println("연산이 불가합니다. ");
		}
		
		
		try {
			String strArray[] = {"123", "456", "abc"};
			int num1, num2, num3, num4, num5;
			num1 = Integer.parseInt(strArray[0]);
			num2 = Integer.parseInt(strArray[1]);
			// num3 = Integer.parseInt(strArray[2]);
			// num4 = Integer.parseInt(strArray[3]);
			num5 = Integer.parseInt(strArray[4]);
			
			System.out.println(num1 + num2);
			// System.out.println(num1 + num3);
			// System.out.println(num1 + num4);
			
		} catch(NumberFormatException e) {
			System.out.println("수치로 변환할 수 없습니다. ");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위를 벗어났습니다. ");
		} catch(Exception e) {
			System.out.println("개발자에게 문의하세요. (010 - 4514 - xxxx) ");
			System.out.println(e.getMessage());
		}
	}
}
