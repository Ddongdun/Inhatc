package week11;

public class Pairi extends Pokemon{
//Pokemon 클래스 상속

	@Override
	public void name() {
	//추상 메소드1 재정의
		System.out.println("이름 : 파이리, 속성 : 불꽃");
		//출력
		
	}

	@Override
	public void attack() {
	//추상 메소드2 재정의
		System.out.println("공격 스킬 : 불꽃");
		//출력
		
	}

	@Override
	public void passive() {
	//추상 메소드3 재정의
		System.out.println("패시브 스킬 : 방어");
		//출력 
		
	}

}
