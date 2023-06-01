package week14;

public class RentEx {
	public static void main(String[] args) {
		HouseAgency houseA = new HouseAgency();
		//HouseAgency 클래스 생성자 선언

		House house = houseA.rent();
		//House house = new House();
		//houseA의 rent 메소드를 이용해 House 클래스 생성자 선언
		house.turnOnLight();
		//불을 켜는 메소드 실행
		
		CarAgency carA = new CarAgency();
		//CarAgency 클래스 생성자 선언
		
		Car car = carA.rent();
		//Car car = new Car();
		//carA의 rent메소드를 이용해 car 클래스 생성자 선언
		car.run();
		//달리는 메소드 실행
	}
}
