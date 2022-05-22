package javapro;

public class ContinueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=10; i++) {
			
			// break는 switch 문에서는 필수로 써야하며, 반복문에서는 필요에 따라 break를 쓸지 말지 결정한다. 
			if (i%2 == 0) {
				continue; // if문 조건에 부합하면 if문 아래의 실행문을 건너뛰고 for 문의 처음으로 돌아가 for문의 실행문을 실행한다. 반복문 안에서 if 문에 continue를 쓴다. 
				// 반복문과는 달리 for 문을 탈출하지 않는다. 
			}
			System.out.println(i);
		}

	}

}
