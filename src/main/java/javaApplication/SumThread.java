package javaApplication;

public class SumThread extends Thread {
	
	// encapsulation 
	private int sum;
	
	// 생성자 부재. 객체 생성시 반드시 생성자가 있어야 한다. 클래스에 생성자가 코딩되지 않았을 경우 default (empty) 생성자가 생성된다. 
	// 만약 생성자를 임의로 만들게 되면, default 생성자가 안만들어지므로 하나 만들어줘야 한다. 
	
	
	public int getSum() {
		return sum;
	}



	public void setSum(int sum) {
		this.sum = sum;
	}


	// Thread 클래스의 run() 메서드를 Override 하여 내가 필요한 기능으로 바꿔준다. 
	@Override
	public void run() {
		for(int i=0; i<=100; i++) {
			sum+=i; 
			
		}
	}
}
