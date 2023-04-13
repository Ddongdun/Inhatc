package week4;

import java.util.Scanner;

public class SwitchGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100) >>");
		//점수를 입력받는다
		
		int score = sc.nextInt();
		//점수를 정수형으로 입력받아 int형 변수에 저장 
		
		char grade = switch(score/10) {
		//grade 변수에 switch문을 넣어서 값을 저장할 수 있다.
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
