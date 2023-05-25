package week11;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();
		//Car 클래스 생성자 선언
		car.tire = new Tire();
		//Car 클래스 내에 선언된 Tire 생성자로 선언
		car.run();
		//car 메소드 실행
		
		car.tire = new HankookTire();
		//한국 타이어로 형변환
		car.run();
		//한국 타이어의 run 메소드 실행
		car.tire = new KumhoTire();
		//금호 타이어로 형변환
		car.run();
		//금호 타이어의 run 메소드 실행 
	}
}
