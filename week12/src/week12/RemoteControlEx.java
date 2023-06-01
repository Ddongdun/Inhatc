package week12;

public class RemoteControlEx {
	public static void main(String[] args) {
		//구현 클래스를 이용하여 객체 생성
		Audio audio = new Audio();
		//Audio 클래스 선언
		TV tv = new TV();
		//TV 클래스 선언
		
		audio.turnOn();
		//audio의 전원 켬
		audio.setVolume(5);
		//audio 볼륨 5로 설정
		audio.setMute(true);
		//audio 무음 설정
		audio.setMute(false);
		//audio 무음 해제
		audio.turnOff();
		//audio 전원 끔
		
		System.out.println("------");
		//줄바꿈
		
		tv.turnOn();
		//tv 전원 켬
		tv.setVolume(3);
		//tv 볼륨 3 설정
		tv.setMute(true);
		//tv 무음 설정
		tv.setMute(false);
		//tv 무음 해제
		tv.turnOff();
		//tv 전원 끔
		
		System.out.println("------");
		//줄바꿈
		
		SmartTV smart = new SmartTV();
		//SmartTV 클래스 선언
		smart.turnOn();
		//SmartTV 전원 켬
		smart.setVolume(3);
		//SmartTV 볼륨 3 설정
		smart.setMute(true);
		//SmartTV 무음 설정
		smart.search("네이버");
		//SmartTV 검색
		smart.setMute(false);
		//SmartTV 무음 해제
		smart.turnOff();
		//SmartTV 전원 끔
		
		System.out.println("------\n << 다형성 구현 결과 >> \n");
		//출력
		RemoteControl[] rc = new RemoteControl[3];
		//인터페이스 변수에 구현 클래스 객체가 대입 => 자동 타입 변환
		rc[0] = audio;
		//0번 audio
		rc[1] = tv;
		//1번 tv
		rc[2] = smart;
		//2qjs SmartTV
		
		for(RemoteControl r : rc) {
		//배열 원소 수 만큼 반복
			r.turnOn();
			//전원 켬
			r.setVolume(5);
			//볼륨 설정
			r.setMute(true);
			//무음 설정
			r.setMute(false);
			//무음 해제
			r.turnOff();
			//전원 끔
			System.out.println("------\n");
			//줄바꿈
		}
		
		//System.out.println("리모컨 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
		//System.out.println("리모컨 최소 볼륨 : " + RemoteControl.MIN_VOLUME);
	}
}
