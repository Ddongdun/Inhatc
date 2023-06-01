package week12;

public class SmartTV implements RemoteControl, Searchable{
//인터페이스 RemoteControl, Searchable을 상속

	private int volume;
	//private 필드 volume
	private int memoryVol;
	//private 필드 memoryVol
	
	@Override
	public void setMute(boolean mute) {
	//메소드 재정의1
		if(mute) {
		//무음모드 설정이라면
			memoryVol = this.volume;
			//현재 볼륨 저장
			System.out.println("Smart TV 무음 처리...");
			//출력
			setVolume(RemoteControl.MIN_VOLUME);
			//볼륨 0으로 설정
		}else {
	     //그렇지 않다면
			System.out.println("Smart TV 무음 해제");
			//무음 해제인 경우 원래 볼륨으로 복원
			setVolume(memoryVol);
			//원래 볼륨으로 설정
		}
	}
	@Override
	public void search(String url) {
	//메소드 재정의
		System.out.println(url + "을 검색합니다.");
		//출력
	}

	@Override
	public void turnOn() {
	//메소드 재정의
		System.out.println("Smart TV를 켭니다");
		//출력
	}

	@Override
	public void turnOff() {
	//메소드 재정의
		System.out.println("Smart TV를 끕니다");
		//출력
	}

	@Override
	public void setVolume(int volume) {
	//메소드 재정의
		if(volume > RemoteControl.MAX_VOLUME) {
		//볼륨이 최대치보다 크다면
			this.volume = RemoteControl.MAX_VOLUME;
			//최대 볼륨 적용
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
		//볼륨이 최소 볼륨보다 작다면
			this.volume = RemoteControl.MIN_VOLUME;
			//최소 볼륨 적용
		}
		else
		//그렇지 않다면
			this.volume = volume;
			//입력받은 볼륨 적용
		System.out.println("현재 Smart TV 볼륨 : " + volume);
		//출력
		
	}
	
	public void printTV() {
	//클래스 메소드
		System.out.println("Smart TV print");
		//출력
	}
	
}
