package week14;

public class CarAgency implements Rentable<Car>{
//인터페이스 Rentable을 car타입으로 상속

	@Override
	public Car rent() {
	//추상 메소드 재정의
		return new Car();
		//Car 클래스 생성자 리턴
	}

}
