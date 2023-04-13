package week4;

public class IfElseErr {
	public static void main(String[] args) {
		int score = 85;
		char grade;
		
		if (score >= 90) {
		//score가 90이상이라면
			System.out.println("점수가 90 이상");
			grade = 'A';
			//등급에 A저장
		}
		else if (score >= 80) {
		//score가 80이상이라면
			System.out.println("점수가 80 이상");
			grade = 'B';
			//등급에 B저장
		}
		else if (score >= 70) {
		//score가 70이상이라면
			System.out.println("점수가 70 이상");
			grade = 'C';
			//등급에 C저장
		}
		else if (score >= 60) {
		//score가 60이상이라면
			System.out.println("점수가 60 이상");
			grade = 'D';
			//등급에 D저장
		} else {
		//score가 60미만이라면
			System.out.println("점수가 60 미만");
			grade = 'F';
			//등급에 F저장
		}
		System.out.println("등급은 " + grade);
		//최종 등급 출력
	}
}
