package week9;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person("1234-5678", "홍길동", 6.1);
		System.out.println(p1.nation + ", " + p1.name);
		System.out.println(p1.height * Person.FEET_CONSTANT);
		
		//final로 정의된 필드는 변경 할 수 없다
//		p1.nation = "USA";
//		p1.ssn = "5678-67876";
		
		p1.name = "이순신";
	}
}
