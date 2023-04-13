package week2;

public class DataType4 {
	public static void main(String[] args) {
		byte bData = 127; //
		128바이트 보다 작은 값 0~127이 출력할 수 있는 범위
		char cData = 90; 
		//음수가 아닌 값
		float fData = 3.14f; 
		//float 타입으로 넣어준다
		long lData = 1000000000L; 
		// long 타입으로 넣어준다
		boolean boolD = true; 
		//true or false
		
		System.out.println("bData = " + bData);
		System.out.println("cData = " + cData);
		System.out.println("fData = " + fData);
		System.out.println("lData = " + lData);
		System.out.println("boolD = " + boolD);
		
		/*
		bData = 127
		cData = Z
		fData = 3.14
		lData = 1000000000
		boolD = true
		*/
	}
}
