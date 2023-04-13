package week4;

public class IfNested {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 100);
		//0~100까지의 랜덤 숫자
		String grade;
		if (score >=90) { 
		//스코어가 90이상이고
			if (score >96) 
			//96점 초과라면
				grade = "A+";
				//등급은 A+
			
			else if (score > 93) 
			//93점 초과라면
				grade = "A";
				//등급은 A
			
			else 
			//그 이외라면
				grade = "A-";
				//등급은 A-
		}
			else if (score >= 80) {
			//스코어가 80이상이고
				if (score > 86) 
				//86점 초과라면
					grade = "B+";
					//등급은 B+
				else if (score > 83)
				//83점 초과라면
					grade = "B";
					//등급은 B
				else
				//그 이외라면
					grade = "B-";
					//등급은 B-
			
			} 
		else
		//그 이하 점수라면
				grade = "F";
				//등급은 F
		System.out.println(score + grade);
	} 
}
