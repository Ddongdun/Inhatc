package week14;

public class MyClass <T>{
//T를 파라미터로 가지는 클래스 선언
	public void printValue(T value) {
	//T 타입의 value를 매개변수로 가지는 함수 선언
		System.out.println("value = " + value);
		//value 출력
	}
}
