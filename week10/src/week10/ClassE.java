package week10;

public class ClassE {
	public ClassE() {
		ClassD c1 = new ClassD();
		//생성자 선언
		c1.field1 = 10;
		//public 필드
		c1.field2 = 10;
		//default 필드
		//c1.field3 = 10;
		//private 필드는 클래스 내에서만 접근 가능
		
		c1.method1();
		//public 메소드
		c1.method2();
		//default 메소드
		//c1.method3();
		//private 메소드는 클래스 내에서만 접근 가능
	}
}
