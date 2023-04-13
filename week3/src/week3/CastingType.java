package week3;

public class CastingType {
	public static void main(String[] args) {
		int iData = 65;
		//A의 아스키코드 값
		char cData = (char) iData;
		//char형식으로 형변환
		System.out.println(cData);
		//A
		
		long lData = 500;
		//정수 500을 Long형으로 선언
		iData = (int)lData;
		//int형식으로 형변환
		System.out.printf("iData = %d\n", iData);
		//iData = 500
		
		double dData = 3.14;
		//실수 3.14.를 double형으로 선언
		iData = (int)dData;
		//int형식으로 형변환
		System.out.printf("iData = %d\n", iData);
		//iData = 3
		//실수를 정수로 형변환하여 소수점 표시x
		
		int iValue = 128;
		//정수 128을 int형으로 선언
		byte bValue = (byte)iValue;
		//byte형식으로 형변
		System.out.println("bValue = " + bValue);
		//bValue = -128
		//표현할 수 있는 범위를 벗어나 오버플로우
		
		if(iValue >= Byte.MIN_VALUE && iValue <= Byte.MAX_VALUE) {
			bValue = (byte)iValue;
		} else {
			System.out.println("Casting 하고자 하는 변수의 값이 범위를 벗어납니다.");
		//Casting 하고자 하는 변수의 값이 범위를 벗어납니다.
		}
	}
}
