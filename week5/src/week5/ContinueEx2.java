package week5;

public class ContinueEx2 {
	public static void main(String[] args) {
		int sum = 0;
		//초기값 선언
		
		for(int i=1;i<=100;i++) {
		//i를 1부터 100보다 작거나 같을때 까지 증가
			if(i%3 == 0) {
			//3의 배수라면
				continue;
				//계속 반복
			}
			sum += i;
			//그렇지 않다면 
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
