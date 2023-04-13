package week5;

public class ContinueEx {
	public static void main(String[] args) {
		for (int i = 1; i<=100; i++) {
		//1부터 100보다 작거나 같을때까지 증가 
			if(i%2 != 0) {
			//i가 홀수라면
				continue;
				//다시 반복
			}
			System.out.println(i);
		}
	}
}
