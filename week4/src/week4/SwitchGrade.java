package week4;

import java.util.Scanner;

public class SwitchGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100) >>");
		
		int score = sc.nextInt();
		
		char grade = switch(score/10) {
		case 10, 9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		default -> 'F';
		};
		
		System.out.println("학점은 " + grade);
		sc.close();
	}
}
