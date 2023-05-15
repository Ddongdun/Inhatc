package week11;

public class LOL extends Game{
	public LOL(String title, String version) {
		super(title, version);
	}
	
	@Override
	public void start() {
		System.out.println("제목 : " + getTitle());
		System.out.println("버전 : " + getVersion());
		System.out.println(getTitle() + "게임을 시작합니다.");
	}
	
	@Override
	public void gameDesc() {
		System.out.println("리그 오브 레전드는 세계 최고의 게임입니다.");
	}
	
	
}
