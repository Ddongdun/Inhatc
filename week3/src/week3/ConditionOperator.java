package week3;

public class ConditionOperator {
	public static void main(String[] args) {
		int num1 = 35;
		int num2 = 47;
		String result;
		
		result = (num1 > num2)? "num1이 num2보다 크다" : "num1이 num2보다 작다";
		//삼항연산자
		System.out.printf("num1 = %d, num2 = %d\n", num1, num2);
		System.out.printf("두 수를 비교한 결과는 %s\n\n", result);
		//num1 = 35, num2 = 47
		//두 수를 비교한 결과는 num1이 num2보다 작다
		
		System.out.printf("%d가 %d보다 큽니까? %b\n\n", num1, num2, (num1 > num2));
		//35가 47보다 큽니까? false
		
		boolean bResult;
		//boolean 형식으로 결과값 담을 변수 선언
		bResult = (num1 > num2)? true:false;
		//boolean 이므로 true, false의 결과 값 도출
		System.out.println(bResult);
		//false
		
		int score = 85;
		String result2;
		result2 = (score > 90)? "우수" : ((score > 80) ? "보통"  : "미달");
		System.out.println("점수는 = " + score + ", 결과는 " + result2);
		//점수는 = 85, 결과는 보통
	}
}
