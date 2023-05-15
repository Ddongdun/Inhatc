package week11;

public class Child extends Parent{
	String field2;
	//Parent 클래스에 정의된 method2를 재정의
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Child-method2");
	}
	
	//method3()는 자식 클래스에만 존재
	public void method3() {
		System.out.println("Child-method3");
	}
}
