package week11;

public class Purin extends Pokemon{
//Pokemon 클래스 상속

	@Override
	public void name() {
	//추상 메소드1 재정의
		System.out.println("이름 : 푸린, 속성 : 노멀");
		//출력
		
	}

	@Override
	public void attack() {
	//추상 메소드2 재정의
		System.out.println("공격 스킬 : 노래하기");
		//출력
		
	}

	@Override
	public void passive() {
	//추상 메소드3 재정의
		System.out.println("패시브 스킬 : 회피");
		//출력 
		
	}

}
