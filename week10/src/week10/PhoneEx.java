package week10;

public class PhoneEx {
	public static void main(String[] args) {
		SmartPhone mine = new SmartPhone("갤럭시", "white");
		System.out.println("모델 : " + mine.model);
		System.out.println("색상 : " + mine.color);
		System.out.println("와이파이 : " + mine.isWifi());
		
		mine.bell();
		mine.sendVoice("Hello");
		mine.receiveVoice("홍길동입니다.");
		mine.hangUp();
		
		mine.setWifi(true);
		mine.internet();
	}
}
