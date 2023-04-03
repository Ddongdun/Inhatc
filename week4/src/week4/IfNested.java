package week4;

public class IfNested {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 100);
		String grade;
		if (score >=90) { 
			if (score >96) 
				grade = "A+";
			
			else if (score > 93) 
				grade = "A";
			
			else 
				grade = "A-";
		}
			else if (score >= 80) {
				if (score > 86) 
					grade = "B+";
				else if (score > 83)
					grade = "B";
				else
					grade = "B-";
			
			} else
				grade = "F";
		System.out.println(score + grade);
	} 
}
