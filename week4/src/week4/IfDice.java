package week4;

public class IfDice {
	public static void main(String[] args) {
		//Math.random() 함수는 0.0 ~ 1.0 미만의 실수값을 얻을 수 있다.
		double num = Math.random();
		System.out.println("랜덤 숫자 : " + num);
		
		int number = (int)(Math.random() * 6 + 1);
		//1~6값을 얻기 위해 1을 더하고 6을 곱해준다
		System.out.println("주사위 던지기 : " + number);
	}
}
