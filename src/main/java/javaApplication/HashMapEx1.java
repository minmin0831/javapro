package javaApplication;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {

	public static void main(String[] args) {
		/*
		DB 쿼리문 
		Insert : 데이터 추가
		Update : 데이터 수정 (HashMap 에는 데이터 수정 메서드가 없다. 대신에 동일한 key를 갖고 있는 데이터가 있으면 값을 바꿔준다. )
		Select : 데이터 조회 
		Delete : 데이터 삭제 
		 */
		Map<String, Integer> map = new HashMap<String, Integer>(); // 키와 값을 가지고 연동하는 것. 
		map.put("Shawn", 88);
		map.put("Arthur", 70);
		map.put("Baily", 96);
		map.put("Shawn", 90); // key 값인 Shawn을 찾아 그에 해당하는 값을 변경. 
		System.out.println("총 자료수 : " + map.size()); // 3. 현재 DB에 있는 key의 개수를 보여준다. 
		System.out.println("Shawn's score : " + map.get("Shawn")); // Shawn의 변경된 값을 가져온다. 
		map.remove("Arthur"); // Arthur의 데이터를 삭제한다. 
		System.out.println("Arthur's score : " + map.get("Arthur")); // Arthur의 데이터를 출력하면 null이 찍힌다. 
		System.out.println("총 자료수 : " + map.size()); // 2. Arthur의 key 값을 삭제하였으므로 하나가 삭제된 2가 출력된다. 

	}

}
