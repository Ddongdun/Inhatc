package week10;

public class SonicAirPlane extends AirPlane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL;
	
	private int soundSpeed;
	private int maxSpeed;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("음속비행합니다.");
		}
		else {
			super.fly();
		}
	}
	public int getSoundSpeed() {
		return soundSpeed;
	}
	public void setSoundSpeed(int soundSpeed) {
		this.soundSpeed = soundSpeed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}
