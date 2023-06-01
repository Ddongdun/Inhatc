package week12;

public class Buds implements EarPhone{
//EarPhone 인터페이스 상속
	public Buds() {
	//Buds 생성자 선언
		System.out.println("\nBuds 이어폰 연결");
		//출력
	}
	@Override
	public void play() {
	//메소드 오버라이드
		System.out.println("삼성 Buds 음악 재생 중...");
		//출력
	}

	@Override
	public void stop() {
	//메소드 오버라이드
		System.out.println("삼성 Buds 음악을 중지합니다.");
		//출력
	}

}
