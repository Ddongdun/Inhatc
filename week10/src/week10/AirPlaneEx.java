package week10;

public class AirPlaneEx {
	public static void main(String[] args) {
		SonicAirPlane sPlane = new SonicAirPlane();
		sPlane.takeOff();
		sPlane.fly();
		sPlane.land();
		
		sPlane.flyMode = SonicAirPlane.SUPERSONIC;
		sPlane.fly();
		sPlane.flyMode = SonicAirPlane.NORMAL;
		sPlane.fly();
	}
}
