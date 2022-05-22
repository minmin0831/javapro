package javaApplication;

import java.awt.Toolkit;

public class ThreadEx2 {

	public static void main(String[] args) {
		
		// 익명으로 Thread 객체를 만들어 프로그램을 돌릴 수도 있다. 
		new Thread() {
			@Override
			public void run() {
				Toolkit tk = Toolkit.getDefaultToolkit();
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
		}.start();
		
		// 다수의 thread를 수행하고자 하면 Thread 객체를 여러 개 생성하여 코딩한다. Main method도 thread dlrl Eoansdp  
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				Toolkit tk = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					System.out.println("띵");
					try { 
						Thread.sleep(500);
						// 시스템 자체에서 예기치 않은 상황(오류)가 발생할 수 있기 때문에 예외처리 한다. 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		}; 
		thread2.start();
		
		/*
		음악을 들으면서 웹브라우징을 할 수 있는 것은 멀티 스레드가 가능하기 때문이다. 
		** 다른 메서드 소개**
		yield() - 다른 thread에게 실행 양보한다. 
		join() - 다른 thread의 종료를 기다린다. 
		interrupt() - 실행 중인 thread를 종료한다. 
		 - 서버 자원을 무한대 시간으로 기다리는 상태를 Deadlock 이라고 한다. 
		 - 갑자기 서버가 죽을 수도 있기 때문에 Deadlock 상황을 피하기 위해 네트워크가 끊길 경우 예외처리로 interrupt() 메서드를 코딩해주어야 한다. 
		 */
		
	}

}
