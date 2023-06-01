package week13;

public class User2 extends Thread{
	Calculator calc;
	
	public void setCalculator(Calculator calc) {
		setName("User2");
		this.calc = calc;
	}
	
	@Override
	public void run() {
		try {
			calc.setMemory(50);
		} catch (InterruptedException e) {}
	}
}
