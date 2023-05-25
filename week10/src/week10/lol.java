package week10;

public class lol extends Game{
//Game 클래스 상속
	public lol(String title, String version) {
	//생성자 선언
		super(title, version);
		//부모의 title과 version을 받는다
	}
	public void lolDesc() {
	//설명 메소드
		System.out.println("리그 오브 레전드는 세계 최고의 MOBA(Multiplayer Online Battle Arena)게임입니다.");
		//출력
	}
	
}
