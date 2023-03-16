package week2;

public class DataType3 {
	public static void main(String[] args) {
		char cData1 = 'A';			//문자열을 직접 저장
		char cData2 = 65;			//10진수로 저장
		char cData3 = '\u0041';		//16진수로 저장
		
		System.out.println("cData1 = " + cData1);
		System.out.println("cData2 = " + cData2);
		System.out.println("cData3 = " + cData3);
		/*
		cData1 = A
		cData2 = A
		cData3 = A
		*/
		
		char cData4 = '가';
		char cData5 = 44032;
		char cData6 = '\uac00';
		
		System.out.println("cData4 = " + cData4);
		System.out.println("cData5 = " + cData5);
		System.out.println("cData6 = " + cData6);
		/*
		cData4 = 가
		cData5 = 가
		cData6 = 가
		*/
		
		//char 타입 변수의 유니코드를 알고 싶으면 int 타입 변수에 저장해서 확인
		int cData7 = 'B';
		int cData8 = '하';
		int cData9 = '&';
		
		System.out.println("cData7 = " + cData7);
		System.out.println("cData8 = " + cData8);
		System.out.println("cData9 = " + cData9);
		/*
		cData7 = 66
		cData8 = 54616
		cData9 = 38
		*/
		
		int cData10 = cData7 + cData9;
		System.out.println("cData10 = " + cData10);
		//cData10 = 104
		
		char cData11 = (char)(cData7 + cData9);
		System.out.println("(cData7 + cData9)의 char = " + cData11);
		//(cData7 + cData9)의 char = h
		
	}
}
