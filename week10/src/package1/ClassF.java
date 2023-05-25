package package1;
import week10.*;
public class ClassF {
	public ClassF() {
		ClassD d1 = new ClassD();
		d1.field1 = 10;
		//public 필드
		//d1.field2 = 10;
		//default 필드는 같은 패키지에서 접근 가능
		//d1.field3 = 10;
		//private 필드는 같은 클래스내에서 접근 가능
		
		d1.method1();
		//public 메소드
		//d1.method2();
		//default 메소드는 같은 패키지에서 접근 가능
		//d1.method3();
		//private 메소드는 같은 클래스내에서 접근 가능
	}
}
