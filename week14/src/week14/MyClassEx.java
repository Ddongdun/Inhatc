package week14;

public class MyClassEx {
	public static void main(String[] args) {
		MyClass<Integer> intClass = new MyClass<>();
		//MyClass를 Integer 타입으로 선언
		intClass.printValue(100);
		//함수 실행
		
		MyClass<String> strClass = new MyClass<>();
		//MyClass를 String 타입으로 선언
		strClass.printValue("홍길동");
		//함수 실행
		
		MyClass<Boolean> boolClass = new MyClass<>();
		//MyClass를 Boolean 타입으로 선언
		boolClass.printValue(true);
		//함수 실행
	}
}
