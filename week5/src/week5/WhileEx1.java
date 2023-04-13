package week5;

public class WhileEx1 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		
		while(num <= 100) {
		//num이 100보다 같거나 작을때까지 반복
			sum += num;
			//sum에 합을 구한다
			num ++;
			//num1 
		}
		
		System.out.println("1~100까지의 합 : " + sum);
	}
}
