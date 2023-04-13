package week7;

public class CarEx {
	public static void main(String[] args) {
		Car mycar = new Car();
		//객체를 생성해야 필드에 접근할 수 있다.
		
		System.out.println("제조회사 : " + mycar.company);
		System.out.println("모델명 : " + mycar.model);
		System.out.println("색상 : " + mycar.color);
		System.out.println("최고속도 : " + mycar.maxSpeed);
		System.out.println("현재속도 : " + mycar.speed);
		
		mycar.speed = 60;
		//필드 값 변경
		System.out.println("현재속도 : " + mycar.speed);
	}
}
