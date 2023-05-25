package week10;

public class PhoneEx {
	public static void main(String[] args) {
		SmartPhone mine = new SmartPhone("갤럭시", "white");
		//SmartPhone 생성자 선언
		System.out.println("모델 : " + mine.model);
		//mine의 모델 출력
		System.out.println("색상 : " + mine.color);
		//mine의 색상 출력
		System.out.println("와이파이 : " + mine.isWifi());
		//mine의 wifi 상태 출력
		
		mine.bell();
		//벨 울리는 메소드
		mine.sendVoice("Hello");
		//전화를 거는 메소드
		mine.receiveVoice("홍길동입니다.");
		//전화를 받는 메소드
		mine.hangUp();
		//전화를 끊는 메소드
		
		mine.setWifi(true);
		//setter로 wifi필드 값을 true로 변경
		mine.internet();
		//인터넷 상태 메소드
	}
}
