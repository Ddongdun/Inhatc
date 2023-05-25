package week10;

public class GameEx {
	public static void main(String[] args) {
		lol lol = new lol("롤", "13.0");
		//lol클래스 생성자 선언
		lol.start();
		//lol 시작
		lol.lolDesc();
		//lol 설명 메소드
		
		System.out.println();
		//줄바꿈
		Tetris tetris = new Tetris("테트리스", "12.5");
		//Tetris 생성자 선언
		tetris.start();
		//Tetris 시작
		tetris.tetrisDesc();
		//Tetris 설명 메소드
		
		System.out.println();
		//줄바꿈
		SuperMario mario = new SuperMario("슈퍼마리오", "15.1");
		//SuperMario 생성자 선언
		mario.start();
		//SuperMario 시작
		mario.marioDesc();
		//SuperMario 설명 메소드
	}
}
