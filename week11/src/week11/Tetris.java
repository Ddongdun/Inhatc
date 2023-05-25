package week11;

public class Tetris extends Game{
//Game 클래스를 상속받는다

	public Tetris(String title, String version) {
	//생성자 선언
		super(title, version);
		//부모의 title과 version을 받는다
	}

	@Override
	public void start() {
	//추상 메소드 재정의
		System.out.println("제목 : " + getTitle());
		//title의 getter 이용
		System.out.println("버전 : " + getVersion());
		//version의 getter 이용
		System.out.println(getTitle() + "게임을 시작합니다.");
		//출력
		
	}

	@Override
	public void gameDesc() {
	//추상 메소드 재정의
		System.out.println("테트리스는 퍼즐 게임입니다.");
		//출력
		
	}
	
}
