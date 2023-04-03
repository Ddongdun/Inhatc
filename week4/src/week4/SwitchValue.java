package week4;

public class SwitchValue {
	public static void main(String[] args) {
		String grade = "B";

		int score1 = 0;
		switch (grade) {
		case "A":
			score1 = 100;
			break;
		case "B":
			score1 = 100 - 20;
			break;
		default:
			score1 = 60;
		}
		System.out.println("score1 = " + score1);
		
		//switch 결과를 변수에 바로 대입 가능
		int score2 = switch(grade) {
		case"A" -> 100;	
		//단일 값을 주는 경우
		case"B" -> {
		//명령문을 추가 하는 경우 {}활룡
			int result = 100 - 20;
			yield result;
			//변수값 지정시 yield 사용
		}
		default -> 60;
		//표현식으로 값을 저장할때 default 필수
		};
		//한 문장이므로 ;
		
		System.out.println("score2 = " + score2);
	}
}
