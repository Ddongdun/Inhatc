package week6;

public class Array1 {
	public static void main(String[] args) {
		//값 목록으로 배열을 생성하는 경우
		int[] score = {70, 90, 65, 83, 50};
		//score배열에 값을 넣는다
		String[] pNames = {"java", "c", "python", "c#"};
		//문자열 배열에 값을 넣는다
		double[] dArray1;
		//더블형 배열 선언
		dArray1 = new double[] {0.1, 0.2, 0.3, 0.4};
		//더블형 배열에 값을 넣는다.
		
		//new 연산자로 배열을 생성하면 자동적으로 기본값으로 초기화됨
		int[] intArray = new int[5];
		//5크기의 배열을 생성한다
		System.out.println("intArray[0] = " + intArray[0]);
		//배열에서 0의 값 출력
		
		double[] dArray2 = new double[5];
		//5크기의 더블형 배열 선언
		System.out.println("dArray2[1] = " + dArray2[1]);
		//배열에서 1의 값 출력
		
		String[] sArray = new String[4];
		//4크기의 문자열형 
		System.out.println("sArray[2] = " + sArray[2]);
		
		//배열에 새로운 값을 저장하려면 반복문을 이용한다.
		for(int i = 0;i<pNames.length;i++) {
			sArray[i] = pNames[i];
			System.out.printf("sArray[%d] = %s\n", i, sArray[i]);
		}
	}
}
