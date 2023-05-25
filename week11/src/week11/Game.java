package week11;

public abstract class Game {
	private String title;
	//타이틀 필드
	private String version;
	//버전 필드
	
	public Game(String title, String version) {
	//Game 클래스 생성자
		this.title = title;
		//자기자신의 타이틀
		this.version = version;
		//자기자신의 버전
	}

	public String getTitle() {
	//title의 getter
		return title;
		//현재 타이틀 리턴
	}

	public void setTitle(String title) {
	//title의 setter
		this.title = title;
		//title 변경
	}

	public String getVersion() {
	//version의 getter
		return version;
		//현재 버전 리턴
	}

	public void setVersion(String version) {
	//verison의 setter
		this.version = version;
		//version 변경
	}
	
	public abstract void start();
	//추상 메소드 start()
	public abstract void gameDesc();
	//추상 메소드 gameDesc()
}
