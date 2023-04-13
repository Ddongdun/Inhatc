package week5;

public class ForGugudan {
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
		//구구단 2단부터 9단까지
			System.out.println("==========");
			System.out.println("구구단 : " + i +"단");
			System.out.println("==========");
			for(int j = 1; j <=9; j++) {
			//*1부터 *9값 
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}
}
