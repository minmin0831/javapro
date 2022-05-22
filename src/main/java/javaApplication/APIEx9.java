package javaApplication;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class APIEx9 {

	public static void main(String[] args) {
		Date now = new Date(); // 자기 기기의 날짜와 시간을 가져오도록 하는 클래스 
		// 날짜 포맷을 변경할 수 있는 클래스 
		SimpleDateFormat adf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); // 기본적으로 소문자이지만 '분(mm)'과 중복되기 때문에 '월'만 MM 대문자로 표시. 
		// format() 메서드는 SimpleDateFormat 에서 포맷을 저장하는 메서드 
		System.out.println(adf.format(now));
		
		// 싱글톤이기 때문에 new 연산자를 사용하지 않고 클래스.메서드를 그대로 가져온다. 
		Calendar now1 = Calendar.getInstance();
		int year = now1.get(Calendar.YEAR);
		// month 는 배열로 생성되어 있기 때문에 0월부터 시작. 때문에 +1을 입력해주어야 한다. 
		int month = now1.get(Calendar.MONTH)+1;
		int day = now1.get(Calendar.DAY_OF_MONTH);
		int hour = now1.get(Calendar.HOUR);
		int minute = now1.get(Calendar.MINUTE);
		int second = now1.get(Calendar.SECOND);
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		
		if(hour>12) {
			System.out.println("오후 " + (hour-12) + "시 " + minute + "분 " + second + "초 ");
		}else {
			System.out.println("오전 " + 	hour + "시 " + minute + "분 " + second + "초 ");
		}
		
		if(hour>12) {
			System.out.println("즐거운 오후되세요. ");
		}else {
			System.out.println("상쾌한 아침입니다. ");
		}
				
	}

}
