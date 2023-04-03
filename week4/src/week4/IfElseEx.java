package week4;

public class IfElseEx {
	public static void main(String[] args) {
		int score = 85;
		//score 변수 선언
		if (score >= 90) {
			//만약 스코어가 90 이상이면
			System.out.println("점수가 90 이상");
			System.out.println("등급은 A");
		} else {
			//그렇지 않다면
			System.out.println("점수가 90 미안");
			System.out.println("등급은 B");
		}
	}
}
