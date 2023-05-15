package week11;

public abstract class Game {
	private String title;
	private String version;
	
	public Game(String title, String version) {
		this.title = title;
		this.version = version;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	public abstract void start();
	public abstract void gameDesc();
}
