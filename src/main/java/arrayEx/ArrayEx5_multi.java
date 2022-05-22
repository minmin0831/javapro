package arrayEx;

public class ArrayEx5_multi {

	public static void main(String[] args) {
		int[][] scores = new int[2][3]; // 대괄호 개수에 따라 차원 수가 다르다. 하나씩 늘어날 때 마다 한 차원씩 늘어난다. new 생성자 타입을 이용해 배열 객채를 만든다. 
		// 앞에 숫자가 행, 뒤에 숫자가 열이다. 
		scores[0][0] = 10;
		scores[0][1] = 45;
		scores[1][2] = 30;
		/*
		배열은 초기값을 주지 않으면 0이 들어간다.
		위 처럼 배열 변수 이름과 배열 위치를 지정하여 값을 할당해주면, 해당 위치로 배열 값이 저장된다. 
		컴퓨터 메모리 구조는 이와 같이 행렬 구조로 되어 있지 않고 일렬로 형성되어 있다. 
		일반 변수는 변수 안에 값이 저장되어 있는 반면, 배열 변수는 주소 값만 저장하고 있고 그 주소값을 통해 heap 영역에서 해당 주소값에 저장된 값을 참조한다. 
		 */
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[0].length; j++) {
				System.out.print(scores[i][j] + "  ");
			}
			System.out.println();
		}
		/*
		다차원 배열의 for 문을 돌릴 때는 이와 같이 i, j를 이용하여 중첩 for문을 돌릴 수 있도록 한다. 
		 */
		
		int[][] scores1 = new int[2][];
		scores1[0]=new int[2];
		scores1[1]=new int[3];
		/*
		line 1에서 최초 배열 선언을 할 때, [2][0]으로 생성하게 되면 2행 1열짜리 배열이 생성되고
		line 2와 3에서 열의 길이를 선언하면 이빨이 맞지 않는 행렬이 생생된다. 
		실제 컴퓨터는 이와 같은 행렬을 저장하는 것이 아니고 heap 영역에 참조하는 방식으로 저장한다. 
		어느 변수에 주소값이 있으면, line 1 주소값을 참조하고 그 다음에 열에 해당하는 주소값을 참조하여 특정 배열 값을 참조한다. 
		 */
	}

}
