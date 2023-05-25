package week9;

public class StaticBlock {
	//인스턴스 필드 & 메소드
	int field1;
	void method1() {
		
	}
	
	//정적 필드 & 메소드
	static int field2;
	static void method2() {
		
	}
	static {
	//정적 초기화 블록
		field2 = 10;
		method2();
	}
	static void method3() {
	//정적 메소드
		//this.field1 = 10;
		//this.method1();
		//인스턴스 멤버를 사용하려면 객체를 생성해야함
		//this 사용 불가
		
		field2 = 10;
		method2();
		//정적 멤버는 클래스에 소속된 멤버이기에 사용 가능
		
		StaticBlock sb = new StaticBlock();
		//인스턴스 멤버를 사용하기 위해 객체 생성
		sb.field1 = 10;
		sb.method1();
		//참조변수로 접근
	}
}
