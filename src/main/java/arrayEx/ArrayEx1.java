package arrayEx;

public class ArrayEx1 { // 실제 값은 없고 주소만 있다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 학생 10명의 점수를 모두 저장하기 위해서는 아래와 같이 할 수밖에 없다. 
		 */
		
		/*
		int score1 = 80;
		int score2 = 90; 
		 */
		
		/*
		 변수는 하나의 데이터만 저장할 수 있다. 
		 하지만 배열은 이름은 하나인데 여러 개의 값을 저장할 수 있다. 
		 */
		
		/*
		int score; // 변수 선언
		score = 50;
		score = 70; // 50이 70으로 바뀐다.  
		 */ 
			
		int[] scores; // 배열 선언. scores 변수에는 배열 주소만 입력되어 있고, score 배열에 100 ~ 103까지 4바이트에 해당하는 주소가 score 변수 하나에 할당된다. 
		scores = new int[5]; // 대괄호에 배열 크기를 넣어준다. 0 ~ 4까지의 인덱스로 구성된 배열이 생성된다. 
		scores[0] = 50; // 인덱스만 달리하여 score를 입력할 수 있도록 한다. 
		scores[1] = 70;
		scores[2] = 50;
		scores[3] = 30;
		scores[4] = 100;
		
		int total = 0;
		int avg = 0;
		for (int i=0; i<5; i++) {
			total += scores[i]; 
		}
		System.out.println("점수의 총합은 " + total);
		System.out.println("점수의 평은 " + total/5);
	} // 배열은 반복문과 찰떡궁합이다. 

}
