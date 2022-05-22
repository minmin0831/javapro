package javapro;

public class TypeEx2 {

	public static void main(String[] args) {
		byte num1=50;
		int num2;
		num2=num1;
		//char num3=num1; // char는 음수 값이 없기 때문에 int에 정수 및 실수를 대입하지 못한다.
		
		//int num4=541225;
		//byte num5=(byte)num4; // 강제 타입 변환은 숫자 변형이 예상되지 않아 잘 쓰지 않는다. 하지만, 실수에서 정수로 바꿀 시 사용하는 경우가 많다. 
		int num4=50;
		if(num4<Byte.MIN_VALUE || num4>Byte.MAX_VALUE) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
		}
		else {
			byte num5=(byte)num4;
			System.out.println(num5);
		}
	}

}
