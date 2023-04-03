package week4;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1년 중 알고 싶은 달을 입력하세요 >>");
		
		int month = sc.nextInt();
		
		switch(month) {
		case 1,3,5,7,8,10,12 -> System.out.println(month + "월은 31일입니다.");
		case 4,6,9,11 -> System.out.println(month + "월은 30일입니다.");
		case 2 -> System.out.println(month + "월은 28일입니다.");
		}
		sc.close();
	}
}
