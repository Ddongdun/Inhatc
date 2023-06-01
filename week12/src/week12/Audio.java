package week12;

public class Audio implements RemoteControl{
//인터페이스 RemoteControl을 상속받음
	
	private int volume;
	//private 변수 volume
	private int memoryVol;
	//private 변수 memoryVol
	
	//디폴트 메소드도 재정의해서 사용 가능
	@Override
	public void setMute(boolean mute) {
	//무음 설정하는 메소드
		if(mute) {
		//무음모드라면
			memoryVol = this.volume;
			//현재 볼륨 저장
			System.out.println("Audio 무음 처리...");
			//출력
			setVolume(RemoteControl.MIN_VOLUME);
			//최소 볼륨 적용
		}else {
			//그렇지 않다면
			System.out.println("Audio 무음 해제");
			//무음 해제인 경우 원래 볼륨으로 복원
			setVolume(memoryVol);
			//원래 볼륨 적용
		}
	}
	
	@Override
	public void turnOn() {
	//메소드 재정의
		System.out.println("Audio를 켭니다");
		//출력
	}

	@Override
	public void turnOff() {
	//메소드 재정의
		System.out.println("Audio를 끕니다");
		//출력
		
	}

	@Override
	public void setVolume(int volume) {
	//메소드 재정의
		if(volume > RemoteControl.MAX_VOLUME) {
		//볼륨이 최대 볼륨보다 크다면
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
			//현재 볼륨 적용
		System.out.println("현재 Audio 볼륨 : " + volume);
		//출력
	}
	
}
