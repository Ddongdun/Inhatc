package week3;

public class CastingType {
	public static void main(String[] args) {
		int iData = 65;
		char cData = (char) iData;
		System.out.println(cData);
		//A
		
		long lData = 500;
		iData = (int)lData;
		System.out.printf("iData = %d\n", iData);
		//iData = 500
		
		double dData = 3.14;
		iData = (int)dData;
		System.out.printf("iData = %d\n", iData);
		//iData = 3
		
		int iValue = 128;
		byte bValue = (byte)iValue;
		System.out.println("bValue = " + bValue);
		//bValue = -128
		
		if(iValue >= Byte.MIN_VALUE && iValue <= Byte.MAX_VALUE) {
			bValue = (byte)iValue;
		} else {
			System.out.println("Casting 하고자 하는 변수의 값이 범위를 벗어납니다.");
		//Casting 하고자 하는 변수의 값이 범위를 벗어납니다.
		}
	}
}