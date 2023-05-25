package week10;

public class ClassD {
	public int field1;
	//public 필드
	int field2;
	//default 필드
	private int field3;
	//private 필드
	
	public ClassD() {
		field1 = 10;
		field2 = 10;
		field3 = 10;
		method1();
		method2();
		method3();
		//클래스 내에서는 private까지 접근 가능
	}
	public void method1() {}
	//public 메소드
	void method2() {}
	//default 메소드
	private void method3() {}
	//private 메소드
	
}
