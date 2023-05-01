package week9;

public class Calculator {
	String color;
	String size;
	
	//정적 필드
	static double pi = 3.14;
	//정적 메소드
	static int minus(int x, int y) {
		return x - y;
	}
	public Calculator(String color, String size) {
		this.color = color;
		this.size = size;
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
		
	}
	
	void exec() {
		double result = avg(7, 10);
		System.out.println("avg(7, 10) 실행결과 : " + result);
	}
	
	int sum1(int [] values) {
		int sum = 0;
//		for (int i = 0; i<values.length; i++) {
//			sum += values[i];
//		}
		
		for(int var : values) {
			sum += var;
		}
		return sum;
	}
	
	int sum2(int ...values) {
		int sum = 0;
		for (int var : values) {
			sum += var;
		}
		return sum;
	}
}
