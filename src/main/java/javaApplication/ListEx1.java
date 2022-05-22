package javaApplication;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {
		// ArrayList 는 List 인터페이스를 구현한 클래스로 가변적으로 변하는 선형 리스트이다. 데이터 타입으로 객체도 들어올 수 있다. 
		List<Integer> scores = new ArrayList<Integer>();
		scores.add(70);
		scores.add(80);
		scores.add(88);
		scores.add(90);
		// 동적 배열이므로 값을 저장할때마다 배열 인덱스가 늘어난다. 
		
		scores.remove(1);
		// index 1에 저장된 값을 지우면 2의 값이 땡겨져 온다. index3 에 저장되었던 값을 호출하면 out of bounds 에러가 표시된다. 
		
		// 일반 배열 저장값 호출할 때 처럼 출력하면 에러난다. 
		// System.out.println("scores[1]");
		
		// ArrayList에 저장된 배열값을 호출하는 방법은 클래스 메서드 호출하는 방식과 동일하다. 
		System.out.println(scores.get(0));
		System.out.println(scores.get(1));
		System.out.println(scores.get(2));
		// System.out.println(scores.get(3));
		
		int total = 0;
		for(int i=0; i<scores.size(); i++) {
			// 배열값을 호출하는 방식이 일반 배열 호출 방식과 다르다. get() 메서드를 사용해야 한다. 
			total = total + scores.get(i);
		}
		
		System.out.println("total : " + total);
		
		/*
		int[] scoresArray = new int[5];
		scoresArray[0] = 70;
		scoresArray[1] = 80;
		for(int i=0; i<scoresArray.length; i++) {
			
		}
		*/
		// 배열은 순차리스트이며 인덱스로 내부의 객체를 관리한다는점등이 유사하지만 한번 생성되면 크기가 변하지 않는다. 
		
		
		
	}

}
