package week4;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1년 중 알고 싶은 달을 입력하세요 >>");
		
		int month = sc.nextInt();
		//int값으로 입력받아 month변수에 저장한다.
		
		switch(month) {
		//month값에 따라 다른 값 출력
		case 1,3,5,7,8,10,12 -> System.out.println(month + "월은 31일입니다.");
		//,로 구분해 여러 값일때를 묶을 수 있다.
		//홀수 달 일때
		case 4,6,9,11 -> System.out.println(month + "월은 30일입니다.");
		//짝수 달 일때
		case 2 -> System.out.println(month + "월은 28일입니다.");
		//2
		}
		sc.close();
	}
}
