package week3;

public class PromotionType {

	public static void main(String[] args) {
		byte bValue = 25;
		int iValue = bValue;
		System.out.println(iValue);
		//25
		
		char cValue = '가';
		iValue = cValue;
		System.out.println(iValue);
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
