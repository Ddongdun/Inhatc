package week6;

public class Array2 {
	public static void main(String[] args) {
		int[] score = new int[10];
		int sum = 0;
		System.out.println("=== 랜덤 생성된 점수 배열 ===");
		for(int i = 0;i<score.length;i++) {
			score[i] = (int)(Math.random()*100);
			System.out.println("score["+i+"] = " + score[i]);
			sum = sum + score[i];
		}
		System.out.println("== 총점 및 평균 ==");
		
		double avg = (double)sum/10;
		System.out.println("총합 = " + sum);
		System.out.println("평균 = " + avg);
	}
}
