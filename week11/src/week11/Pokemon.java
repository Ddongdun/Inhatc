package week11;

public abstract class Pokemon {
	public void introduce() {
		name();
		attack();
		passive();
	}

	public abstract void name();
	public abstract void attack();
	public abstract void passive();
}
