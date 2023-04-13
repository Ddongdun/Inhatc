package week7;

public class Car3Ex {
	public static void main(String[] args) {
		Car3 mycar1 = new Car3();
		System.out.printf("%s, %s, %d\n", mycar1.model, mycar1.color, mycar1.maxSpeed);
		
		Car3 car2 = new Car3("그랜저");
		System.out.printf("%s, %s, %d\n", car2.model, car2.color, car2.maxSpeed);
		
		Car3 car3 = new Car3("그랜저", "white");
		System.out.printf("%s, %s, %d\n", car3.model, car3.color, car3.maxSpeed);
		
		Car3 car4 = new Car3("그랜저", "white", 300);
		System.out.printf("%s, %s, %d\n", car4.model, car4.color, car4.maxSpeed);
	}
}
