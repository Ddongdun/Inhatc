package week7;

public class Car3 {
	String model;
	String color;
	int maxSpeed;
	
	Car3() {}
	Car3(String model){
		//this.model = model;
		//this.color = "white";
		//this.maxSpeed = 300;
		this(model, "white", 300);
	}
	Car3(String model, String color){
		//this.model = model;
		//this.color = color;
		this(model, color, 300);
	}
	Car3(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	//생성자 오버로딩
}
