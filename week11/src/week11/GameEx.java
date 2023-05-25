package week11;

public class GameEx {
	public static void main(String[] args) {
		Game[] game = new Game[3];
		//Game 클래스를 배열로 선언
		game[0] = new LOL("롤", "13.0");
		//0번째에 LOL 클래스 생성자 선언
		game[1] = new Tetris("테트리스", "12.5");
		//1번째에 Tetris 클래스 생성자 선언
		game[2] = new SuperMario("슈퍼마리오", "15.1");
		//2번째 SuperMario 클래스 생성자 선언
		
		for(Game g : game) {
		//반복
			g.start();
			//start 메소드 실행
			g.gameDesc();
			//gameDesc 메소드 실행
			System.out.println("----------");
			//줄바꿈 
		}
	}
}
