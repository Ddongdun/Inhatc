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
	//Calculator 생성자
		this.color = color;
		//자신의 color
		this.size = size;
		//자신의 size
	}
	
	void powerOn() {
	//전원을 키는 메소드
		System.out.println("전원을 켭니다");
		//출력
	}
	
	void powerOff() {
	//전원을 끄는 메소드
		System.out.println("전원을 끕니다");
		//출력
	}
	
	int plus(int x, int y) {
	//덧셈 메소드
		int result = x + y;
		//매개변수를 더한다
		return result;
		//값 리턴
	}
	
	double divide(int x, int y) {
	//나눗셈 메소드
		double result = (double)x / y;
		//매개변수를 더블 형식으로 형변환하여 나눈다
		return result;
		//값 리턴
	}
	
	double avg(int x, int y) {
	//평균 메소드
		double sum = plus(x, y);
		//덧셈 메소드를 이용해 값 저장
		double result = sum / 2;
		//평균을 구한다
		return result;
		//값 리턴
		
	}
	
	void exec() {
	//7, 10의 평균 구하는 메소드
		double result = avg(7, 10);
		//avg메소드를 이용해 평균을 구한다
		System.out.println("avg(7, 10) 실행결과 : " + result);
		//출력
	}
	
	int sum1(int [] values) {
	//배열의 길이만큼 더하는 메소드
		int sum = 0;
		//결과값을 담을 변수
//		for (int i = 0; i<values.length; i++) {
//			sum += values[i];
//		}
		
		for(int var : values) {
		//values를 var에 담아 반복
			sum += var;
			//더한다
		}
		return sum;
		//결과 값 리턴
	}
	
	int sum2(int ...values) {
	//위 메소드의 또다른 형식
		int sum = 0;
		for (int var : values) {
			sum += var;
		}
		return sum;
	}
}
