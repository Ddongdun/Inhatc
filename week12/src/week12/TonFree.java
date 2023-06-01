package week12;

public class TonFree implements EarPhone{
//EarPhone 인터페이스 상속
	public TonFree() {
	//TonFree 생성자
		System.out.println("\nLG 블루투스 이어폰 톤프리 연결");
		//출력
	}
	
	@Override
	public void play() {
	//메소드 재정의
		System.out.println("LG 톤프리 음악 재생 중...");
		//출력
	}

	@Override
	public void stop() {
	//메소드 재정의
		System.out.println("LG 톤프리 음악을 중지합니다.");
		//출력
	}

}
