package week14;

public class Box <T>{
//T타입을 파라미터로 제네릭 선언
	private T t;
	//private 변수 t선언, 타입은 T

	public T getT() {
	//t의 getter
		return t;
		//t 반환
	}

	public void setT(T t) {
	//t의 setter
		this.t = t;
		//입력받은 매개변수 저장
	}
	
}
