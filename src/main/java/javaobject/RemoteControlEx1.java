package javaobject;

public class RemoteControlEx1 {

	public static void main(String[] args) {
		Television lgTv = new Television();
		
		lgTv.turnOn();
		lgTv.setVolume(5);
		lgTv.setMute(true);
		lgTv.setMute(false);
		lgTv.turnOff();
		RemoteControl.changeBattery();
		
		Audio sonyAudio = new Audio();
		RemoteControl remoteControl1 = new Audio();
		RemoteControl remoteControl2 = new Television();
	}

}
