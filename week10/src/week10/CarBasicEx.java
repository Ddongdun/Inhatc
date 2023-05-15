package week10;

public class CarBasicEx {
	public static void main(String[] args) {
		CarBasic car = new CarBasic();
		//car.commapy = "현대자동차";
		car.setCompany("현대자동차");
		car.setModel("그랜저");
		car.setColor("그랜저");
		car.setMaxSpeed(350);
		
		System.out.println(car.getCompany());
		System.out.println(car.getModel());
		System.out.println(car.getColor());
		System.out.println(car.getMaxSpeed());
	}
}
