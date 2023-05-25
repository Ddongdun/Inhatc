package week11;

public class DriverEx {
	public static void main(String[] args) {
		Driver d = new Driver();
		//Driver 클래스 생성자 선언
		Vehicle v = new Vehicle();
		//Vehicle 클래스 생성자 선언
		d.drive(v);
		//운전 메소드 실행
		
		Bus bus = new Bus();
		//Bus 클래스 생성자 선언
		d.drive(bus);
		//버스 운전 메소드 실행
		d.drive(new Taxi());
		//택시 운전 메소드 실행 
		
	}
}
