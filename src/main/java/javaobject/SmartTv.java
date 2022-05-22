package javaobject;

// 다중 인터페이스 구
public class SmartTv implements RemoteControl, Searchable {

	@Override
	public void turnOn() {
		System.out.println("Turn on your Smart TV. ");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off your Smart TV. ");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			volume = RemoteControl.MAX_VOLUME;
			
		} else if(volume < RemoteControl.MIN_VOLUME) {
			volume = RemoteControl.MIN_VOLUME;
			
		} else {
			
		}
		System.out.println("Current volume : " + volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url + " 을 검색합니다. ");
	}
	
}
