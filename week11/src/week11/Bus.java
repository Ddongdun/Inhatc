package week11;

public class Bus extends Vehicle{
//Vehicle 클래스 상속
	@Override
	public void run() {
	//부모 클래스 오버라이드
		System.out.println("버스가 달립니다");
		//출력
	}
}
