package week2;

public class Print4 {
	public static void main(String[] args) {
		System.out.println(23+18);
		System.out.println("23+18="+ (23+18));
		
		/*
		 * 숫자 출력 포맷
		 * %d : 정수 출력
		 */
		System.out.printf("숫자 연산 : 23+18 = %d\n", (23+18));
		System.out.printf("더하기 : 53+17= %d\n", (53+17));
		System.out.printf("빼기 : 53-17= %d\n", (53-17));
		System.out.printf("곱하기 : 53*17= %d\n", (53*17));
		System.out.printf("나누기 : 53/17= %d\n", (53/17));
		
		/*
		41
		23+18=41
		숫자 연산 : 23+18 = 41
		더하기 : 53+17= 70
		빼기 : 53-17= 36
		곱하기 : 53*17= 901
		나누기 : 53/17= 3
		*/
	}
}
