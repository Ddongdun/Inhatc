package week10;

public class Phone {
	//private인 경우에는 상속 불가
	public String model;
	public String color;
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone 생성자 호출");
	}
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String msg) {
		System.out.println("나 : " + msg);
	}
	
	public void receiveVoice(String msg) {
		System.out.println("너 : " + msg);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}

