package javaApplication;

public class LambdaEx1 {

	public static void main(String[] args) {
		// 표준 코드 
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				for(int i=1; i<=10; i++) {
					System.out.println("출력값 : " +i);
				}
			}
			
		};
		Thread thread = new Thread(runnable); // Runnable의 추상메서드는 Override 하더라도 독립적으로 출력되지 않는다. 때문에 Thread 클래스를 만들어 파라미터에 대입하여 출력한다.
		thread.start();
		
		// 람다식을 적용한 코드 (인터페이스의 추상메서드를 간결하게 람다식으로 표현 () -> {코드블럭} 
		Runnable runnable2 = () -> {
			for(int i=1; i<=10; i++) {
				System.out.println("출력값 : " +i);
			}
		};
		Thread thread2 = new Thread(runnable2);
		thread2.start();
		
		// Thread 익명 객체를 만들고 코드블록 안에 Runnable 내부의 run() 메서드를 입력해준다. 
		Thread thread3 = new Thread(){
		    public void run(){
		      System.out.println("Thread Running");
		    }
		  };
		  thread3.start();
		
		// 가장 간단한 람다식 코드 (Thread를 익명 객체로 두고 파라미터에 람다식을 입력한다.) 
		new Thread(() -> {
			for(int i=1; i<=10; i++) {
				System.out.println("출력값 : " +i);
			}
		}).start();
		
	}

}
