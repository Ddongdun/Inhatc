package week9;

public class Car {
	int gas;
	
	//연료 넣는 메소드
	void setGas(int gas){
		this.gas = gas;
	}
	
	//연료가 있는지 없는지 체크하는 메소드
	boolean isLeftGas() {
		if (gas > 0) {
			System.out.println("gas가 있습니다.");
			return true;
		}
		
		System.out.println("gas가 없습니다.");
		return false;
	}
	
	//자동차가 달리는 메소드
	void run() {
		while (true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas 잔량 : " + gas + ")");
				gas--;
			}else {
				System.out.println("멈춥니다. (gas 잔량 : " + gas + ")");
				break;
			}
		}
	}
}
