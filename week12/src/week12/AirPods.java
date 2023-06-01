package week12;

public class AirPods implements EarPhone{
//EarPhone 인터페이스 상속
	public AirPods() {
	//AirPods 생성자
		System.out.println("\n새로 구입한 Apple AirPods 연결");
		//출력
	}
	
	@Override
	public void play() {
	//메소드 오버라이드
		System.out.println("Apple AirPods 음악 재생 중...");	
		//출력
	}

	@Override
	public void stop() {
	//메소드 오버라이드
		System.out.println("Apple AirPods 음악을 중지합니다.");
		//출력
	}

}
