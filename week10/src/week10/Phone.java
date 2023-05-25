package week10;

public class Phone {
	//private인 경우에는 상속 불가
	public String model;
	//모델명
	public String color;
	//색상명
	public Phone(String model, String color) {
	//생성자 정의
		this.model = model;
		//매개변수 model을 받는다
		this.color = color;
		//매개변수 color을 받는
		System.out.println("Phone 생성자 호출");
		//출력
	}
	public void bell() {
	//벨이 울리는 메소드
		System.out.println("벨이 울립니다.");
		//출력
	}
	
	public void sendVoice(String msg) {
	//전화를 거는 메소드
		System.out.println("나 : " + msg);
		//msg 출력
	}
	
	public void receiveVoice(String msg) {
	//전화를 받는 메소드
		System.out.println("너 : " + msg);
		//msg 출력
	}
	
	public void hangUp() {
	//전화를 끊는 메소드
		System.out.println("전화를 끊습니다.");
		//출력
	}
}

