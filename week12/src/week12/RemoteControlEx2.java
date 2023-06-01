package week12;

public class RemoteControlEx2 {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
		//RemoteControl 클래스 선언
			
			@Override
			public void turnOff() {
			//메소드 재정의
				System.out.println("익명 객체 전원을 켭니다");
				//출력
			}
			
			@Override
			public void turnOn() {
			//메소드 재정의
				System.out.println("익명 객체 전원을 끕니다");
				//출력
			}
			
			@Override
			public void setVolume(int volume) {
			//메소드 재정의
				System.out.println("익명 객체 볼륨을 조절합니다");
				//출력
			}
		};
		
		rc.turnOn();
		//전원 켬
		rc.setVolume(5);
		//볼륨 5 설정
		rc.turnOff();
		//전원 끔
	}
}
