package week9;

public class CarEx {
	public static void main(String[] args) {
		Car mycar = new Car();
		//Car 클래스 생성자 선언
		mycar.setGas(5);
		//연료를 5만큼 준다
		
		if(mycar.isLeftGas()) {
		//연료가 있다면
			System.out.println("출발합니다.");
			//출력
		}
		
		mycar.run();
		//달린다
		System.out.println("프로그램 종료");
		//종료
	}
}
