package week14;

public class Product<T, M> {
//T와 M을 파라미터로 가지는 클래스 선언
	private T kind;
	//t타입의 private 필드 kind 선언
	private M model;
	//M타입의 private 필드 model 선언
	
	public T getKind() {
	//T 타입의 kind의 getter
		return kind;
		//kind 리턴
	}
	public void setKind(T kind) {
	//T 타입의 kind의 setter
		this.kind = kind;
		//kind를 매개변수로 받아 넣는다
	}
	public M getModel() {
	//M 타입의 model의 getter
		return model;
		//model 리턴
	}
	public void setModel(M model) {
	//M 타입의 model의 setter
		this.model = model;
		//model을 매개변수로 받아 넣는다
	}
	
}
