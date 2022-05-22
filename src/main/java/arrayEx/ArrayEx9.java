package arrayEx;

public class ArrayEx9 {

	public static void main(String[] args) {
		int[] scores = {90, 80, 96, 70, 88};
		int sum = 0; // 값이 연속적으로 변동할 값은 초기값을 할당한다. 
		double avg; // 어떤 값만 넣으려면, 초기값은 비워둔다. 
		
		/*
		for(int i = 0; i < scores.length; i++) {
			sum+=scores[i];
		}
		*/
		
		for(int score: scores) { // score 변수는 scores 배열에서 배열 값을 하나씩 받아 for문을 실행시킨다. 
			sum += score;
		}
		
		avg = (double) sum/scores.length;
		
		System.out.println("sum = " + sum);
		System.out.println("average = " + avg);
	}

}
