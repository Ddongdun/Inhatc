package week14;

public class HouseAgency implements Rentable<House>{
//인터페이스 Rentable을 House타입으로 상속

	@Override
	public House rent() {
	//메소드 재정의
		return new House();
		//House 클래스 생성자 리턴
	}
	
}
