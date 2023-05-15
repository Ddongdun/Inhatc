package week10;

public class GameEx {
	public static void main(String[] args) {
		lol lol = new lol("롤", "13.0");
		lol.start();
		lol.lolDesc();
		
		System.out.println();
		Tetris tetris = new Tetris("테트리스", "12.5");
		tetris.start();
		tetris.tetrisDesc();
		
		System.out.println();
		SuperMario mario = new SuperMario("슈퍼마리오", "15.1");
		mario.start();
		mario.marioDesc();
	}
}
