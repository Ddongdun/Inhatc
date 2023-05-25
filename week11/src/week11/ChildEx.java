package week11;

public class ChildEx {
	public static void main(String[] args) {
		Child child = new Child();
		//child 클래스 생성자 선
		
		//자식 클래스 객체는 부모 클래스 참조변수에 대입 가능
		//자동 타입 변환
		Parent parent = child;
		parent.method1();
		
		//자동 타입 변환이 적용된 경우 부모 객체라도
		//자식 객체에서 재정의된 메소드가 호출
		parent.method2();
		
		//자식 객체가 부모 객체로 자동 타입 변환되면
		//자식객체에만 정의된 메소드나 필드는 호출 불가
		//parent.method3();
		//parent.field2 = "홍길동";
		
		//casting:
		//자식 객체가 자동 타입 변환된 부모 객체만
		//casting이 가능
		child = (Child)parent;
		child.field2 = "홍길동";
		child.method3();
		
		//Parent p1 = new Parent();
		//child = (Child)p1;
		//child.field2 = "홍길동";
	}
}
