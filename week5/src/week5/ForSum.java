package week5;

public class ForSum {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1 ; i<=100 ; i++) 
		//100보다 작거나 같을때 까지 반복
			sum = sum + i;
			//sum변수에 계속 더한다
		System.out.println("1~100 까지의 합 : " + sum);
		
	}
}
