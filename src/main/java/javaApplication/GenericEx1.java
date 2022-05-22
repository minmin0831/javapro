package javaApplication;

import java.util.ArrayList;
import java.util.List;

public class GenericEx1 {

	public static void main(String[] args) {
		
		// raw type List와 raw type ArrayList. (비 generic type) 
		List list = new ArrayList();
		list.add("Chris"); // index[0] 에는 객체 주소가 저장되어 있다. 
		list.add("Rogan"); // index[0] 에는 객체 주소가 저장되어 있다. 
		list.add(50); // index[0] 에는 실제 값이 저장되어 있다. 
		list.add(5.3); // index[0] 에는 실제 값이 저장되어 있다.
		/*
		데이터 타입을 지정해주지 않을 경우 동적 배열은 여러 가지의 값을 넣어줄 수 있다. 
		각각의 객체를 따로 관리한다는 유연하다는 장점이 있지만, 나중에 프로그램을 돌릴 때 많은 문제점이 발생한다. 
		때문에 java5 부터는 데이터 타입을 정하여 동적으로 index가 유동적으로 줄어들고 늘어날 수 있도록 하였다. 
		그래서 아래와 같이 기본적으로 코딩하자고 합의
		클래스명<데이터타입>
		인터페이스명<데이터타입>
		 */
		
		String tempName = (String)list.get(0);
		System.out.println(tempName);
		
		List<String> listArray = new ArrayList<String>();
		listArray.add("Stella");
		listArray.add("Joe");
		String tempName2 = listArray.get(1);
		System.out.println(tempName2);
		
	}

}
