package week5;

import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		while(true) {
			System.out.println("첫 번째 수 입력 >>");
			num1 = sc.nextInt();
			//num1에 입력값 저장
			
			System.out.println("두 번째 수 입력 >>");
			num2 = sc.nextInt();
			//num2에 입력값 
			
			System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
		}
	}
}
