package week14;

public class UtilEx {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.boxing(100);
		//Util 클래스의 boxing 메소드를 호출해 Integer 타입 객체인 box1 생성
		int intVal = box1.getT();
		//Box 클래스의 T의 getter 실행
		System.out.println("box1 = " + intVal);
		//getter 값 출력
		
		Box<String> box2 = Util.boxing("홍길동");
		//Util 클래스의 boxing 메소드를 호출해 String 타입 객체인 box2 생성
		String strVal = box2.getT();
		//Box 클래스의 T의 getter 실행
		System.out.println("box2 = " + strVal);
		//getter 값 출력
	}
}
