package week12;

public interface RemoteControl {
	//인터페이스는 객체 사용 설명서이므로 실행 도중 데이터를 저장하는 필드 선언 불가능
	//인터페이스에서 선언 가능한 것은 상수(static final)뿐이다.
	//상수는 반드시 초기화 해야 한다.
	//static final을 생략해도 컴파일 도중 자동 생성
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//인터페이스는 객체 사용 설명서
	//public abstract를 생략해도 컴파일 과정에서 자동 생성
	//최종적으로 구현 클래스에서 재정의해서 사용해야 함
	public void turnOn();
	//전원을 켜는 메소드
	void turnOff();
	//전원을 끄는 메소드
	void setVolume(int volume);
	//볼륨 설정 메소드
	
	//default 메소드 추가
	//디폴트 메소드 선언 => 기존 구현 클래스에는 영향을 주지 않는다
	default void setMute(boolean mute) {
	//무음 설정 default 메소드
		if(mute) {
		//무음설정되었다면
			System.out.println("무음 처리합니다");
			//출력
			setVolume(MIN_VOLUME);
			//상수로 0 설정
		} else {
		  //그렇지 않다면
			System.out.println("무음 해제합니다");
			//상수로 10 설정
		}
	}
	
}
