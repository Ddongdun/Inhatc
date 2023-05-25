package week10;

public class Tetris extends Game{
//Game 클래스를 상속 받는다
	public Tetris(String title, String version) {
	//생성자 선언
		super(title, version);
		//부모의 title과 version을 받는다
	}
	public void tetrisDesc() {
	//설명 메소드
		System.out.println("테트리스(Tetris)는 퍼즐 게임으로, 소련의 프로그래머 알렉세이 파지트노프가 처음 디자인하고 프로그래밍 한 게임이다.");
		//출력
	}
}
