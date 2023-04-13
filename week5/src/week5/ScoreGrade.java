package week5;

import java.util.Scanner;

public class ScoreGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("SCORE           GRADE");
		System.out.println("=====================");
		while(true) {
		//무한반복
			int score = sc.nextInt();
			//score를 계속 입력받는다
			if(score <= 100 && score >= 90) {
			//점수가 90이상이고 100이하일때
				System.out.printf("  %d             A\n", score);
				//A
			}
			else if(score < 90 && score >= 80) {
			//점수가 80이상이고 90미만일때
			//조건이 겹치지 않게 해주어야 한다
				System.out.printf("  %d             B\n", score);
				//B
			}
			else if(score < 80 && score >= 70) {
			//점수가 70이상이고 80미만일때
				System.out.printf("  %d             C\n", score);
				//C
			}
			else if(score < 70 && score >= 60) {
			//점수가 60이상이고 70미만일때
				System.out.printf("  %d             D\n", score);
				//D
			}
			else if(score < 60 && score >= 50) {
			//점수가 50이상이고 60미만일때
				System.out.printf("  %d             E\n", score);
				//E
			}
			else if(score < 50 && score >= 0) {
			//점수가 0점 이상이고 50미만일때
				System.out.printf("  %d             F\n", score);
				//F
			}
			else if(score < 0) {
			//음수를 입력받았다면
				System.out.println("프로그램 종료\n");
				break;
				//반복문 탈출
			}
		}
	}
}
