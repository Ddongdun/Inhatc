package week10;

public class ClassA {
	//생성자 오버로딩
	public ClassA(boolean data) {}
	//public 생성자
	ClassA(int data){}
	//default 생성자
	private ClassA(String data) {}
	//private 생성자
	
	ClassA c1 = new ClassA(true);
	ClassA c2 = new ClassA(10);
	ClassA c3 = new ClassA("문자열");
	
}
