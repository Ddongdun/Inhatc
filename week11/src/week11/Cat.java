package week11;

public class Cat extends Animal{
//Animal 클래스 상속
	public Cat() {
	//생성자 선언
		this.kind = "포유류";
		//종류 필드에 값을 넣는다
	}
	@Override
	public void sound() {
	//부모 메소드 오버라이드
		System.out.println("야옹");
		//출력
		
	}
	
	public void catLife() {
	//고양이 설명 메소드
		System.out.println("Cat 평균 수명은 약 12~15년입니다");
		//출력
	}
}
