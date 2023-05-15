package week10;

public class ClassA {
	//생성자 오버로딩
	public ClassA(boolean data) {}
	ClassA(int data){}
	//default
	private ClassA(String data) {}
	
	ClassA c1 = new ClassA(true);
	ClassA c2 = new ClassA(10);
	ClassA c3 = new ClassA("문자열");
	
}
