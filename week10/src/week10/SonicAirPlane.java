package week10;

public class SonicAirPlane extends AirPlane{
//AirPlane을 상속받는다
	public static final int NORMAL = 1;
	//절대 불변 상수 필드1
	public static final int SUPERSONIC = 2;
	//절대 불변 상수 필드2
	
	int flyMode = NORMAL;
	//flyMode를 지정하는 필드
	
	private int soundSpeed;
	//private 필드1
	private int maxSpeed;
	//private 필드2
	
	@Override
	public void fly() {
	//AirPlane의 fly메소드 오버라이드
		if(flyMode == SUPERSONIC) {
		//flyMode 가 SUPERSONIC이라면
			System.out.println("음속비행합니다.");
			//음속 비행
		}
		else {
		//그렇지 않다면
			super.fly();
			//부모 클래스의 fly메소드 실행
		}
	}
	public int getSoundSpeed() {
	//private 필드 soundSpeed의 getter
		return soundSpeed;
	}
	public void setSoundSpeed(int soundSpeed) {
	//private 필드 soundSpeed의 setter
		this.soundSpeed = soundSpeed;
	}
	public int getMaxSpeed() {
	//private 필드 getMaxSpeed의 getter
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
	//private 필드 getMaxSpeed의 setter
		this.maxSpeed = maxSpeed;
	}
	
}
