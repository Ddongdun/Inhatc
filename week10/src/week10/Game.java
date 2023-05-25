package week10;

public class Game {
	public String title;
	//게임 타이틀
	public String version;
	//게임 버전
	
	public Game(String title, String version) {
	//생성자 선언
		this.title = title;
		//자신의 타이틀
		this.version = version;
		//자신의 버전
	}
	
	public void start() {
	//게임 시작 메소드
		System.out.println("제목 : " + title);
		//타이틀 출력
		System.out.println("버전 : " + version);
		//버전 출력
		System.out.println(title + "게임을 시작합니다.");
		//게임 시작 출력
	}
	
	
}
