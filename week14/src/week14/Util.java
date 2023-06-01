package week14;

public class Util {
	public static <T> Box<T> boxing(T t){
	//T타입의 매개변수 t를 받아 Box<T>로 반환하는 제네릭 메소드
		Box<T> box = new Box<>();
		//Box클래스를 T타입으로 생성자 선언
		box.setT(t);
		//Box 클래스의 t변수에 매개변수를 넣는다
		return box;
		//box 객체 리턴
	}
}
