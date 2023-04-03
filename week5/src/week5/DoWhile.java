package week5;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		String inputStr;
		
		do {
			System.out.print(">");
			inputStr = sc.nextLine();
			System.out.println(inputStr);
		} while(!inputStr.equals("q"));
		System.out.println("프로그램 종료");
	}
}
