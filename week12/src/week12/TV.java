package week12;

public class TV implements RemoteControl{
//TV 클래스는 RemoteControl 인터페이스를 구현하는 구현클래스이다.
	
	private int volume;
	//private 필드 volume
	@Override
	public void turnOn() {
	//메소드 재정의
		System.out.println("TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else
			this.volume = volume;
		System.out.println("현재 TV 볼륨 : " + volume);
	}
	
}
