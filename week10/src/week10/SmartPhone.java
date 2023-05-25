package week10;

public class SmartPhone extends Phone{
//Phone 클래스를 상속받는다
	private boolean wifi;
	//와이파이 상태를 알려주는 필드
	public SmartPhone(String model, String color) {
	//생성자 선언
		super(model, color);
		//부모의 model과 color를 받는다
		//this.model = model;
		//this.color = color;
		System.out.println("SmartPhone 생성자 호출");
		//출력
	}
	public boolean isWifi() {
	//wifi의 getter
		return wifi;
		//같은 boolean타입으로 선언해 true or false 값 리턴
	}
	public void setWifi(boolean wifi) {
	//wifi의 setter
		this.wifi = wifi;
		//매개변수 값으로 설정
	}
	
	public void internet() {
	//인터넷 메소드
		System.out.println("인터넷 연결");
		//출력
	}
	
	
}
