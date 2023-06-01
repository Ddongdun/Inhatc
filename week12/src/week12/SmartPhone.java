package week12;

public class SmartPhone {
	EarPhone earphone;
	//Earphone 클래스 선언
	
	public void musicon(EarPhone ep) {
	//음악재생 메소드
		ep.play();
		//Earphone의 play 메소드 실행
	}
	
	public void musicoff(EarPhone ep) {
	//음악멈춤 메소드
		ep.stop();
		//Earphone의 stop 메소드 실행
	}
}
