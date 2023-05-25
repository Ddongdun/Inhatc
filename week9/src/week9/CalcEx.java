package week9;

public class CalcEx {
	public static void main(String[] args) {
		Calculator c1 = new Calculator("white", "small");
		//Calculator 생성자 선언
		System.out.println(c1.color + ", " + c1.size);
		//생성자에 넣은 값 출력
		
		c1.powerOn();
		//전원을 키는 메소드 호출
		
		int result1 = c1.plus(10, 20);
		//덧셈 메소드 호출
		System.out.println("plus(10, 20) = " + result1);
		//출력
		
		double result2 = c1.divide(10, 20);
		//나눗셈 메소드 호출
		System.out.println("divide(10, 20) = " + result2);
		//출력
		
		
		byte b1 = 10;
		//매개변수1
		byte b2 = 20;
		//매개변수2
		result2 = c1.divide(b1, b2);
		//나눗셈 메소드 호출
		System.out.println("dibide(10, 20) = " + result2);
		//출력
		
		c1.exec();
		//7, 10의 평균 구하는 메소드 호출
		
		int [] arr = {1, 2, 3, 4, 5};
		//배열 선언
		int sum1 = c1.sum1(arr);
		//arr의 원소들의 합을 구하는 메소드 호출
		System.out.println("{1, 2, 3, 4, 5} = " + sum1);
		//출력
		
		System.out.println("{1, 2, 3} = " + c1.sum2(1, 2, 3));
		//3번째 원소까지의 합 출력
		System.out.println("{1, 2, 3, 4, 5} = " + c1.sum2(1, 2, 3, 4, 5));
		//다른방식으로 합 더해서 출력
		
		c1.powerOff();
		//전원을 끄는 메소드 호출
		
		int radius = 0;
		//원의 반지름
		double r1 = Calculator.pi * radius * radius;
		//원의 넓이를 구함
		System.out.println(r1);
		//출력
		
		int x = 8;
		//매개변수1
		int y = 7;
		//매개변수2
		System.out.println(Calculator.minus(x, y));
		//출력
		
	}
}
