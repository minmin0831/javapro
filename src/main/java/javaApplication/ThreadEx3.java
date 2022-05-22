package javaApplication;

public class ThreadEx3 {

	public static void main(String[] args) {
		
		// 인스턴스 객체 생성. 
		SumThread sumThread = new SumThread();
		
		// Thread 클래스 호출하는 start() 메서드. Thread 클래스의 start() 메서드를 실행하면 SumThread 클래스의 run() 메서드를 호출한다. 
		sumThread.start();
		
		try {
			// run() 메서드가 한번 돌때까지 기다려준다. join() 메서드를 코딩하지 않으면 Thread 특성 상 start() 메서드와 getSum() 메서드가 동시에 수행된다. 
			sumThread.join();
			// 네트워크 끊김(Deadlock) 문제 같은 예기치 않은 상황이 발생하면 예외 처리 구문을 수행할 수 있도록 예외상황을 catch 한다. 
		}catch(InterruptedException e) {
			// Thread를 정지시키는 interrupt() 메서드. 
			sumThread.interrupt();
		}
		// Mac 에서는 run()과 getSum() 메서드가 동시에 수행된다. 
		
		System.out.println("1부터 100까지의 합 = " + sumThread.getSum());
	}

}
