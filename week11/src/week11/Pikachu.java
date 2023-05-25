package week11;

public class Pikachu extends Pokemon {
//Pokemon 클래스 상속

	@Override
	public void name() {
	//추상 메소드1 재정의
		System.out.println("이름 : 피카츄, 속성 : 번개");
		//출력
		
	}

	@Override
	public void attack() {
	//추상 메소드2 재정의
		System.out.println("공격 스킬 : 백만볼트");
		//출력
		
	}

	@Override
	public void passive() {
	//추상 메소드3 재정의
		System.out.println("패시브 스킬 : 스피드");
		//출력 
		
	}
}
