package week11;

public class Dog extends Animal {
//Animal 클래스 상속
	public Dog() {
	//생성자 선언
		this.kind = "포유류";
		//종류 필드에 넣는다
	}
	@Override
	public void sound() {
	//부모 추상 메소드 오버라이드
		System.out.println("멍멍");
		//출력
	}
	
	public void dogLife() {
	//강아지 설명 메소드
		System.out.println("Dog 평균 연령은 약15~20년 입니다");
		//출력
	}
	
	
}
