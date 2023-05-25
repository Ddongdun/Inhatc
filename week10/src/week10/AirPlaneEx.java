package week10;

public class AirPlaneEx {
	public static void main(String[] args) {
		SonicAirPlane sPlane = new SonicAirPlane();
		//SonicAirPlane 생성자 선언
		sPlane.takeOff();
		//이륙 메소드
		sPlane.fly();
		//비행 메소드
		sPlane.land();
		//착륙 메소드
		
		sPlane.flyMode = SonicAirPlane.SUPERSONIC;
		//비행 모드를 음속으로 변경
		sPlane.fly();
		//비행 모드가 음속이 되어 재정의된 비행 메소드 출력
		sPlane.flyMode = SonicAirPlane.NORMAL;
		//비행 모드를 노멀로 변경
		sPlane.fly();
		//비행 모드가 노멀로 변경되어 부모의 비행 메소드 출력
	}
}
