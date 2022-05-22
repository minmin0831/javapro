package enumEX;

public class EnumEx2 {

	public static void main(String[] args) {
		
		Week weekday = Week.valueOf("SUNDAY"); // valueOf 메서드는 매개값으로 주어지는 문자열과 동일한 열거객체를 반환한다. 
		System.out.println(weekday);
		
		
		if(args.length == 0) {
			System.out.println("매개변수값이 없습니다.");
		} else {
			String day = args[0];
			Week weekday2 = Week.valueOf(day);
			
			if(weekday2 == Week.SATURDAY || weekday2 == Week.SUNDAY) {
				System.out.println("주말이네요.");
			} else {
				System.out.println("평일이군요.");
			}
		}
		// values 메서드는 열거 타입의 모든 열거 객체들을 배열로 만들어서 반환 
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}

}
