package week5;
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 몇 단을 계산할까요?");
		
		int num = sc.nextInt();
		//구구단 단수를 입력 받는다
		
		System.out.println("=== 구구단 " + num + "단 ===");
		for(int i = 1 ; i <= 9 ; i ++)
		//*1부터 *9값 까지 반복
			System.out.println(num + " * " + i + " = " + (num * i));
		
		/*구구단 몇 단을 계산할까요? 9
				=== 구구단 9단 ===
				9 * 1 = 9
				9 * 2 = 18
				9 * 3 = 27
				9 * 4 = 36
				9 * 5 = 45
				9 * 6 = 54
				9 * 7 = 63
				9 * 8 = 72
				9 * 9 = 81
				*/

	}
}
