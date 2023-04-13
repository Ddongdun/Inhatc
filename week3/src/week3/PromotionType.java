package week3;

public class PromotionType {

	public static void main(String[] args) {
		byte bValue = 25;
		//byte형식으로 25 선언
		int iValue = bValue;
		//byte를 int형 변수에 넣어준다
		System.out.println(iValue);
		//25
		
		char cValue = '가';
		//char형식으로 가 선언
		iValue = cValue;
		//char를 int형 변수에 넣어준다
		System.out.println(iValue);
		//자동으로 int형으로 변환된다.
		//44032
		
		iValue = 375;
		long lValue = iValue;
		System.out.println(lValue);
		//375
		
		double dValue = iValue;
		System.out.println(dValue);
		//375.0
	}

}
