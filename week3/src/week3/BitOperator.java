package week3;

public class BitOperator {
	public static void main(String[] args) {
		byte num1 = 45;
		byte num2 = 25;
		int result = num1 & num2;
		//2진수로 바꿔 and연산 시켜준 값
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("result = " + result);
		//num1 = 45
		//num2 = 25
		//result = 9
		
		System.out.printf("num1 = %6s\n", Integer.toBinaryString(num1));
		//2진수로 바꿔주는 내장 함수
		System.out.printf("num2 = %6s\n", Integer.toBinaryString(num2));
		//2진수로 바꿔주는 내장 함수
		System.out.printf("result(&) = %6s\n", Integer.toBinaryString(result));
		//2진수로 바꿔주는 내장 함수
		//num1 = 101101
		//num2 =  11001
		//result(&) =   1001
		
		result = num1 | num2;
		//or연산
		System.out.printf("result(|) = %6s\n", Integer.toBinaryString(result));
		//result(|) = 111101
		
		result = num1 ^ num2;
		//xor연산(or의 반전 값)
		System.out.printf("result(^) = %6s\n", Integer.toBinaryString(result));
		//result(^) = 110100
		
		result = ~num1;
		//반전
		System.out.printf("~num1=      %6s\n", Integer.toBinaryString(result));
		//~num1=      11111111111111111111111111010010
	}
}
