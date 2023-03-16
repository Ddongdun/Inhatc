package week3;

public class OneOperand1 {
	public static void main(String[] args) {
		int iValue1 = +100;
		int iValue2 = -100;
		double dValue1 = +3.14;
		double dValue2 = -10.5;
		
		int result1 = +iValue1;
		int result2 = -iValue1;
		System.out.println("result 1 = " + result1);
		System.out.println("result 2 = " + result2);
		//result 1 = 100
		//result 2 = -100
		
		short sValue = 100;
		//int보다 크기가 작은 경우 부호 연산자의 결과는 int 타입이 된다.
		//short sResult = -sValue;
		int sResult = sValue;
		byte bValue = -100;
		int bResult = -bValue;
		
		System.out.println("sResult = " + sResult);
		System.out.println("sResult = " + bResult);
		//sResult = 100
		//sResult = 100
	}
}
