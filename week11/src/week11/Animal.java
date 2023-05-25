package week11;

public abstract class Animal {
	public String kind;
	//동물의 종류 필드
	
	public void breathe() {
	//숨쉬기 메소드
		System.out.println("숨을 쉽니다");
		//출력
	}
	
	public abstract void sound();
	//추상 메소드
}	
