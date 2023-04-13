package week2;

public class DataType2 {
	public static void main(String[] args) {
		float fValue = 3.14f;
		//f를 붙여 실수형으로 인식시킬 수 있다.
		double dValue = 3.14;
		System.out.println("fValue = " + fValue);
		System.out.println("dValue = " + dValue);
		/*
	 	fValue = 3.14
		dValue = 3.14
		*/
		
		//정밀도 테스트
		fValue = 0.1234567890123456789f;
		//f를 붙여 float형으로 인식시킨다.
		dValue = 0.1234567890123456789d;
		//d를 붙여 double형으로 인식시킨다.
		System.out.println("fValue = " + fValue);
		System.out.println("dValue = " + dValue);
		/*
		fValue = 0.12345679
		dValue = 0.12345678901234568
		double은 float의 두배 크기이므로 출력량도 두배까지 가능
		iData = 450000
		fData = 3.0E7
		dData1 = 3.0E7
		dData2 = 3.0E-7
		*/
		
		int iData = 450000;
		float fData = 3e7f;
		double dData1 = 3e7;
		double dData2 = 3e-7;
		System.out.println("iData = " + iData);
		System.out.println("fData = " + fData);
		System.out.println("dData1 = " + dData1);
		System.out.println("dData2 = " + dData2);
		
		System.out.println();
		/*
		iData = 450000
		fData = 3.0E7
		dData1 = 3.0E7
		dData2 = 3.0E-7
		*/
		
		/*
		 * 실수 출력 포맷
		 * %f : float, double형
		 */
		System.out.printf("iData = %d\n", iData);
		System.out.printf("fData = %f\n", fData);
		System.out.printf("dData1 = %f\n", dData1);
		System.out.printf("dData2 = %f\n", dData2);
		System.out.println();
		/*
		iData = 450000
		fData = 30000000.000000
		dData1 = 30000000.000000
		dData2 = 0.000000
		*/
		
		System.out.printf("fData = %.4f\n", fData);
		System.out.printf("dData1 = %.2f\n", dData1);
		System.out.printf("dData2 = %10.8f\n", dData2);
		/*
		fData = 30000000.0000
		dData1 = 30000000.00
		dData2 = 0.00000030
		*/
		
		
	}
}
