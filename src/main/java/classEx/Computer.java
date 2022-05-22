package classEx;

public class Computer {
	int sum1(int[] values) { // 4 line 에서 return type 을 int로 지정했기 때문에, 해당 method는 반드시 return value를 지정해야 한다. return 문이 없을 경우, 컴파일 오류가 난다. 
		int sum = 0; 
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum; 
		
		/*
		 메소드 선언에 return type (여기서는 int)이 있는 메소드는 return 문을 사용해서 return value 을 지정해야 한다. 
		 만약 return 문이 없다면 컴파일 오류가 난다. return 문이 실행되면 메소드는 즉시 종료된다. 
		*/
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
