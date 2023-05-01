package week9;

public class Person {
	//상수
	static final double FEET_CONSTANT = 30.48;
	
	//final 필드
	final String nation = "Korea";
	final String ssn;
	
	//인스턴스 필드
	String name;
	double height;
	
	public Person(String ssn, String name, double height) {
		this.ssn = ssn;
		this.name = name;
		this.height = height;
	}
}
