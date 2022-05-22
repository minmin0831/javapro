package arrayEx;

public class ArrayEx4 {

	public static void main(String[] args) {
		// 문제: 성적 배열을 이용해서 합격자수를 출력하는 프로그램을 완성하시오. 
		// 조건 - 점수가 80 이상일 경우 합격 
		int scores[] = {
				75, 85, 92, 60, 77, 53, 60, 99, 86, 73
		}; // 선언과 동시에 크기를 정의한다. 초기값의 크기는 중괄호 안에 입력한 값의 개수 만큼으로 정해진다. 
		
		int count=0; 
		for(int i=0; i<scores.length; i++) {
			if(scores[i]>=80) { // scores[i]>=80 와 같이 배열에서 개별 값을 가져와서 비교할 경우, i 라는 변수를 배열 기호 안에 대입시킨다. 
				count ++; // count = count+1 을 의미한다. 
			}
		}
		
		System.out.println("합격자수: " + count + "명"); 
	} 

}
