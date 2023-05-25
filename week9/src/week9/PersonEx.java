package week9;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person("1234-5678", "홍길동", 6.1);
		//Person 클래스 생성자 선언
		System.out.println(p1.nation + ", " + p1.name);
		//nation과 name 출력
		System.out.println(p1.height * Person.FEET_CONSTANT);
		//키와 상수를 곱한 값 출력
		
		//final로 정의된 필드는 변경 할 수 없다
		//p1.nation = "USA";
		//p1.ssn = "5678-67876";
		
		p1.name = "이순신";
		//name변수에 이순신을 넣는다
	}
}
