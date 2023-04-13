package week7;

public class Car2Ex {
	public static void main(String[] args) {
		//Car2 mycar = new Car2();
		//개발자에 의해서 생성자가 정의된 경우에는 기본 생성자가 자동으로 생성되지 않는다.
		Car2 mycar = new Car2("그랜저", "black", 300);
		System.out.println(mycar.model);
		System.out.println(mycar.color);
		System.out.println(mycar.maxSpeed);
		
		Car2 yourcar = new Car2();
	}
}
