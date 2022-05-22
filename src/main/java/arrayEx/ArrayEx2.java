package arrayEx;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[] = {50, 70, 50, 30, 100, 100, 100}; // 배열에 한번에 각 인덱스다 배열 값을 부여할 수 있다. 		
		int total = 0;
		int avg = 0;
		for (int i=0; i<scores.length; i++) { // scores.length 는 scores 라는 배열의 배열 크기를 의미한다. 
			total += scores[i]; 
		}
		System.out.println("점수의 총합은 " + total);
		System.out.println("점수의 평은 " + total/scores.length);

	} 

}
