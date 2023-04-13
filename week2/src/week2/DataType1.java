package week2;

public class DataType1 {
	public static void main(String[] args) {
		byte bData = 65;
		//1byte
		int iData = 65;
		//4byte
		short sData = 65;
		//2byte
		long lData = 65;
		//8byte
		float fData = 65.12f;
		//float 데이터는 f를 붙여준다
		//4byte
		double dData = 65.12d;
		//double 데이터는 d를 붙여준다
		//8byte
		char cData = 65;
		//2byte
		boolean boolData = true;
		//1byte
		
		System.out.println("bData = " + bData);
		System.out.println("iData = " + iData);
		System.out.println("sData = " + sData);
		System.out.println("lData = " + lData);
		System.out.println("fData = " + fData);
		System.out.println("dData = " + dData);
		System.out.println("cData = " + cData);
		System.out.println("boolData = " + boolData);
		/*
		bData = 65
		iData = 65
		sData = 65
		lData = 65
		fData = 65.12
		dData = 65.12
		cData = A
		boolData = true
		*/
	}
}
