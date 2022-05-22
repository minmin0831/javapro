package enumEX;

import java.util.Calendar;

public class EnumEx1 {

	public static void main(String[] args) {
		Week today = null; // 방금 만든 Week 열거타입 배열의 타입을 넣고 변수 이름을 선언하고 변수값은 null로 항당한다. 
		Calendar now = Calendar.getInstance();
		int week = now.get(Calendar.DAY_OF_WEEK);
		switch(week) {
			case 1: 
				today = Week.SUNDAY;
				break;
			case 2: 
				today = Week.MONDAY;
				break;
			case 3: 
				today = Week.TUESDAY;
				break;
			case 4: 
				today = Week.WEDNESDAY;
				break;
			case 5: 
				today = Week.THURSDAY;
				break;
			case 6: 
				today = Week.FRIDAY;
				break;
			case 7: 
				today = Week.SATURDAY;
				break;
		}
		
		System.out.println("오늘은 " + today + " 입니다.");
		if(today==Week.SUNDAY || today==Week.SATURDAY) {
			System.out.println("일요일에는 푹 쉽니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
		
		Week day = Week.SUNDAY;
		String name = day.name(); // name 메서드는 day가 열거상수로 갖고 있는 요일을 문자열 값으로 받는다. 
		int ordinal = day.ordinal(); // ordinal 메서드는 day가 열거상수로 갖고 있는 요일의 위치(순번)을 정수로 반환한다. 
		System.out.println(name);
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY; // 위치값이 0이다.
		Week day2 = Week.FRIDAY; // 위치값이 4이다. 
		int difference = day1.compareTo(day2); // compareTo 라는 메서드는 상대적 위치의 차이값을 반환한다. 
		int difference2 = day2.compareTo(day1);
		System.out.println(difference);
		System.out.println(difference2);

	
		
		/*
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int weekday = now.get(Calendar.DAY_OF_WEEK);
		int hour = now.get(Calendar.HOUR);
		
		System.out.println("올해는?" + year);
		System.out.println("이번달은?" + month);
		System.out.println("오늘은?" + day);
		System.out.println("오늘은?" + weekday);
		System.out.println("오늘은?" + hour);
		*/
		
		
		
	}

}
