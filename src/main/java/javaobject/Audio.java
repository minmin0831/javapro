package javaobject;

public class Audio implements RemoteControl {
	private int volume;
	/* 
	private 으로 선언하였기 때문에 main 메서드 실행 시 해당 필드 사용하려면 이 클래스 파일에서 Getter / Setter 만들어줘야 한다. 
	하지만 setVolume 에서 파라미터로 이미 volume 값을 받도록 되었기 때문에, 필수적인 상황이 아니면 Getter / Setter 를 생성하지 않는다. 
	 */

	@Override
	public void turnOn() {
		System.out.println("Turn on the audio");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off the audio");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
			
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
			
		} else {
			this.volume = volume;
			
		}
		System.out.println("Current audio volume : " + this.volume);
	}

}
