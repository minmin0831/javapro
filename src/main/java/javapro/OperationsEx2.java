package javapro;

public class OperationsEx2 {

	public static void main(String[] args) {
		boolean play=true;
		System.out.println(play);
		play=!play;
		System.out.println(play);
		play=!play; // 앞 라인에서 false를 다시 반전하라는 코드. true로 변환한다. 
		System.out.println(play);

	}

}
