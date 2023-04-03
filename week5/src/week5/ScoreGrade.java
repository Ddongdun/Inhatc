package week5;

import java.util.Scanner;

public class ScoreGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("SCORE           GRADE");
		System.out.println("=====================");
		while(true) {
			int score = sc.nextInt();
			if(score <= 100 && score >= 90) {
				System.out.printf("  %d             A\n", score);
			}
			else if(score < 90 && score >= 80) {
				System.out.printf("  %d             B\n", score);
			}
			else if(score < 80 && score >= 70) {
				System.out.printf("  %d             C\n", score);
			}
			else if(score < 70 && score >= 60) {
				System.out.printf("  %d             D\n", score);
			}
			else if(score < 60 && score >= 50) {
				System.out.printf("  %d             E\n", score);
			}
			else if(score < 50 && score >= 0) {
				System.out.printf("  %d             F\n", score);
			}
			else if(score < 0) {
				System.out.println("프로그램 종료\n");
				break;
			}
		}
	}
}
