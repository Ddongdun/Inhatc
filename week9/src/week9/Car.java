package week9;

public class Car {
	int gas;
	//연료량 변수
	
	void setGas(int gas){
	//연료 넣는 메소드
		this.gas = gas;
		//매개변수로 받은 연료를 집어넣는다
	}
	
	
	boolean isLeftGas() {
	//연료가 있는지 없는지 체크하는 메소드
		if (gas > 0) {
		//연료가 0보다 많다면
			System.out.println("gas가 있습니다.");
			//출력
			return true;
			//트루 리턴
		}
		else {
		//연료가 0이라면
		System.out.println("gas가 없습니다.");
		//출력
		return false;
		//폴스 리턴
		}
	}
	
	void run() {
	//자동차가 달리는 메소드
		while (true) {
		//무한반복
			if(gas > 0) {
			//연료가 0보다 많다면
				System.out.println("달립니다. (gas 잔량 : " + gas + ")");
				//계속 달린다
				gas--;
				//연료 소비
			}else {
			//연료가 0이라면
				System.out.println("멈춥니다. (gas 잔량 : " + gas + ")");
				//멈춘다
				break;
				//탈출
			}
		}
	}
}
