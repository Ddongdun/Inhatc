package week10;

public class SuperMario extends Game{
//Game 클래스를 상속 받는다
	public SuperMario(String title, String version) {
	//생성자 선언
		super(title, version);
		//부모의 title과 version을 받는다
	}
	public void marioDesc() {
	//설명 메소드
		System.out.println("닌텐도의 대표 비디오 게임 시리즈인 마리오 시리즈의 핵심이 되는 본가 시리즈.");
		//출력
	}
}
