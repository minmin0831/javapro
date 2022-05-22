package javapro;

public class SwitchEx3 {

	public static void main(String[] args) {
		char grade='A';
		switch(grade) {
		case 'A':
		case 'a': // 컴퓨터는 글자별로 binary 해석할 때, 대/소문자를 구분하여 해석한다. 때문에 여기서 대/소문자 모두 허용될 수 있도록 입력해준다. 
			System.out.println("VIP 회원입니다. ");
			System.out.println("20% 할인을 받을 수 있습니다. ");
			break;
			
		case 'B':
		case 'b':
			System.out.println("우수 회원입니다. ");
			System.out.println("10% 할인을 받을 수 있습니다. ");
			break;
			
		case 'C':
		case 'c':
			System.out.println("일반 회원입니다. ");
			break;
			
		default:
			System.out.println("등급이 잘못되었습니다. ");
		}

	}

}
