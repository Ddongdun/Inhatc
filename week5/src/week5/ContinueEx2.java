package week5;

public class ContinueEx2 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1;i<=100;i++) {
			if(i%3 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1~100까지 3의 배수를 제외한 합 : " + sum);
		
		//검산
		int sum2 = 0;
		for (int i=1; i<=100; i++) {
			if(i%3 == 0)
				sum2+=i;
		}
		System.out.printf("%d + %d = %d", sum, sum2, sum+sum2);
	}
}