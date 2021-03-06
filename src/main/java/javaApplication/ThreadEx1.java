package javaApplication;

import java.awt.Toolkit;

public class ThreadEx1 {

	// main 메서드도 하나의 thread이다. main thread 라고 한다. 
	public static void main(String[] args) {
		
		// 시스템 상에서 beep 소리를 울리는 thread 이다. 
		Thread thread = new Thread() {
			
			// run() 이라는 메서드가 실행 구문이 없는 추상 메서드이기 때문에 이 프로그램에서 수행하고자 하는 제어문을 작성한다. 
			@Override 
			
			// Thread 가 갖고 있는 익명 자식 객체 run() 
			public void run() {
				
				// 수행할 내용. 
				Toolkit tk = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					// Toolkit 클래스 내 beep() 라는 메서드 사용. 
					tk.beep();
					try {
						// 0.5초 동안 정지하라는 메서드이다. parameter 값이 1이면 0.001초 이다. 
						Thread.sleep(500);
						
						// 시스템 자체에서 예기치 않은 상황(오류)가 발생할 수 있기 때문에 예외처리 한다. 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		}; 
		// Thread 객체를 만들었으면 반드시 start()를 해주어야 한다. 
		thread.start();
		
		/*
		하나의 명령문이 끝났다는 의미로 semi-colon(;)을 붙여준다. 
		Thread 객체 하나, 그 안에 메서드 하나를 하나의 실행블록으로 보기 때문에 semi-colon 을 붙여준다. 
		*/
		
		// 위의 thread가 돌면서 beep 소리가 울리는데, 이것을 시각적으로 표하기 위해 추가한 for loop에 불과하다. 
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { 
				Thread.sleep(500);
				// 시스템 자체에서 예기치 않은 상황(오류)가 발생할 수 있기 때문에 예외처리 한다. 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
