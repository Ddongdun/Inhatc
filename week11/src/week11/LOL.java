package week11;

public class LOL extends Game{
//Game 클래스 상속
	public LOL(String title, String version) {
	//생성사 선언
		super(title, version);
		//부모의 title과 version을 받아온다
	}
	
	@Override
	public void start() {
	//추상 메소드 재정의
		System.out.println("제목 : " + getTitle());
		//title의 getter 이용
		System.out.println("버전 : " + getVersion());
		//version의 getter 이용
		System.out.println(getTitle() + "게임을 시작합니다.");
	}
	
	@Override
	public void gameDesc() {
	//추상 메소드 재정의
		System.out.println("리그 오브 레전드는 세계 최고의 게임입니다.");
		//출력
	}
	
	
}
