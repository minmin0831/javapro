package javapro;

public class SwitchEx2 {

	public static void main(String[] args) {
		
		int score = 45;
		
		switch(score/10) { // 답이 하나로 정해진 경우에는 switch문이 더 편하다. 대소 비교 판단은 if문이 더 편하다. 
		
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8: 
				System.out.println("B");
				break;
			case 7: 
				System.out.println("C");
				break;
			case 6: 
				System.out.println("D");
				break;
			case 5: case 4: case 3: case 2: case 1: case 0: 
				System.out.println("F");
				break;
			default: 
				System.out.println("점수를 잘못 입력하였습니다.");

		} 
	}

}
