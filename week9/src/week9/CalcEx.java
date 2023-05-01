package week9;

public class CalcEx {
	public static void main(String[] args) {
		Calculator c1 = new Calculator("white", "small");
		System.out.println(c1.color + ", " + c1.size);
		
		c1.powerOn();
		
		int result1 = c1.plus(10, 20);
		System.out.println("plus(10, 20) = " + result1);
		
		double result2 = c1.divide(10, 20);
		System.out.println("divide(10, 20) = " + result2);
		
		
		byte b1 = 10;
		byte b2 = 20;
		result2 = c1.divide(b1, b2);
		System.out.println("dibide(10, 20) = " + result2);
		
		c1.exec();
		
		int [] arr = {1, 2, 3, 4, 5};
		int sum1 = c1.sum1(arr);
		System.out.println("{1, 2, 3, 4, 5} = " + sum1);
		
		System.out.println("{1, 2, 3} = " + c1.sum2(1, 2, 3));
		System.out.println("{1, 2, 3, 4, 5} = " + c1.sum2(1, 2, 3, 4, 5));
		
		c1.powerOff();
		
		int radius = 0;
		double r1 = Calculator.pi * radius * radius;
		System.out.println(r1);
		
		int x = 8;
		int y = 7;
		System.out.println(Calculator.minus(x, y));
		
	}
}
