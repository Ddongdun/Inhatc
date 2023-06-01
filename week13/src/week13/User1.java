package week13;

public class User1 extends Thread{
	Calculator calc;
	
	public void setCalculator(Calculator calc) {
		setName("User1");
		this.calc = calc;
	}
	
	@Override
	public void run() {
		try {
			calc.setMemory(100);
		} catch (InterruptedException e) {}
	}
}
