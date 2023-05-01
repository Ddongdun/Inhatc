package week9;

public class CarEx {
	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.setGas(5);
		
		if(mycar.isLeftGas()) {
			System.out.println("출발합니다.");
		}
		
		mycar.run();
		System.out.println("프로그램 종료");
	}
}
