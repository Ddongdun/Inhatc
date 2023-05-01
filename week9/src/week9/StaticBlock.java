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
		field2 = 10;
		method2();
	}
	static void method3() {
//		this.field1 = 10;
//		this.method1();
		
		field2 = 10;
		method2();
		
		StaticBlock sb = new StaticBlock();
		sb.field1 = 10;
		sb.method1();
	}
}
