package week6;

public class Array1 {
	public static void main(String[] args) {
		//값 목록으로 배열을 생성하는 경우
		int[] score = {70, 90, 65, 83, 50};
		String[] pNames = {"java", "c", "python", "c#"};
		double[] dArray1;
		dArray1 = new double[] {0.1, 0.2, 0.3, 0.4};
		
		//new 연산자로 배열을 생성하면 자동적으로 기본값으로 초기화됨
		int[] intArray = new int[5];
		System.out.println("intArray[0] = " + intArray[0]);
		
		double[] dArray2 = new double[5];
		System.out.println("dArray2[1] = " + dArray2[1]);
		
		String[] sArray = new String[4];
		System.out.println("sArray[2] = " + sArray[2]);
		
		//배열에 새로운 값을 저장하려면 반복문을 이용한다.
		for(int i = 0;i<pNames.length;i++) {
			sArray[i] = pNames[i];
			System.out.printf("sArray[%d] = %s\n", i, sArray[i]);
		}
	}
}
