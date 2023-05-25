package week11;

public abstract class Pokemon {
	public void introduce() {
	//소개 하는 메소드
		name();
		attack();
		passive();
	}

	public abstract void name();
	//추상 메소드1
	public abstract void attack();
	//추상 메소드2
	public abstract void passive();
	//추상 메소드3 
}
