package javaobject;

// interface file: Remote Controller interface 를 만든다. 
public interface RemoteControl {
	
	// 상수 필드
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상 메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume); // 인터페이스는 데이터를 저장할 필드를 가질 수 없지만, 추상 메서드 상에 파라미터는 받을 수 있다. 
	
	// 디폴트 메서드 : 해당 파라미터 값이 들어오면 반드시 아래 메서드 실행 구문을 실행시킨다. 
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("Mute the device");
		} else {
			System.out.println("Unmute the device");
		}
	}
	
	// 정적 메서드 : 이 안에서만 사용하는 메서드 
	static void changeBattery() {
		System.out.println("Change your battery. ");
	}
}
