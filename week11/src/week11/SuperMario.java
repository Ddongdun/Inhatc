package week11;

public class SuperMario extends Game{
//Game 클래스 상속

	public SuperMario(String title, String version) {
	//생성자 선언
		super(title, version);
		//부모의 title과 version 받는다
	}

	@Override
	public void start() {
	//추상 메소드 재정의
		System.out.println("제목 : " + getTitle());
		//title의 getter 이용
		System.out.println("버전 : " + getVersion());
		//verison의 getter 이용
		System.out.println(getTitle() + "게임을 시작합니다.");
		//출력
		
	}

	@Override
	public void gameDesc() {
	//추상 메소드 재정의
		System.out.println("슈퍼마리오는 닌텐도의 대표 비디오 게임 시리즈입니다." + "");
		//출력
	}

}
