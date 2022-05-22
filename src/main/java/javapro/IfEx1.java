package javapro;

public class IfEx1 {

	public static void main(String[] args) {
		int score=300;
		if(score>=80) {
			System.out.println("합격하셨습니다.");
		} else {
			System.out.println("불합격하셨습니다.");
		}
		System.out.println("수고하셨습니다.");


	// 복합 if 문 
		if(score>=90) {
			System.out.println("A"); 
		} else if(score>=80) {
			System.out.println("B");
		} else if(score>=70) {
			System.out.println("C");
		} else if(score>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		} System.out.println("수고하셨습니다.");
		
	// 중첩 if 문 
		if(score>100 || score<0) {
			System.out.println("점수 입력이 잘못되었습니다.");
		} else {
			if(score>=90) {
				System.out.println("A");
			} else if(score>=80) {
				System.out.println("B");
			} else if(score>=70) {
				System.out.println("C");
			} else if(score>=60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			} System.out.println("수고하셨습니다.");
		}
		
		
		
		int price=10000;
		int age=65;
		int chargeable;
		if(age>=65) {
			chargeable=(int)(price*0.7);
			System.out.println("요금은" + chargeable + "원 입니다.");
		} else if(age>=19) {
			System.out.println("요금은" + price + "입니다.");
		} else if(age>=14) {
			chargeable=(int)(price*0.8);
			System.out.println("요금은" + chargeable + "원 입니다.");
		} else if(age<=13) {
			chargeable=(int)(price*0.5);
			System.out.println("요금은" + chargeable + "원 입니다.");
		} else {
			System.out.println("요금은 없습니다.");
		}
		
		
		if(age>=65) {
			chargeable=(int)(price*0.7);
		} else if(age>=19) {
			chargeable=price*1;
		} else if(age>=14) {
			chargeable=(int)(price*0.8);
		} else if(age<=13) {
			chargeable=(int)(price*0.5);
		} else {
			chargeable=0;
		} System.out.println("요금은" + chargeable + "원 입니다.");
		
		
		
	
}
}
