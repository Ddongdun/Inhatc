package week10;

public class Game {
	public String title;
	public String version;
	
	public Game(String title, String version) {
		this.title = title;
		this.version = version;
	}
	
	public void start() {
		System.out.println("제목 : " + title);
		System.out.println("버전 : " + version);
		System.out.println(title + "게임을 시작합니다.");
	}
	
	
}
