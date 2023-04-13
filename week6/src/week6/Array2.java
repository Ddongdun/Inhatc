package week6;

public class Array2 {
	public static void main(String[] args) {
		int[] score = new int[10];
		//10크기를 갖는 정수형 배열 선언
		int sum = 0;
		System.out.println("=== 랜덤 생성된 점수 배열 ===");
		for(int i = 0;i<score.length;i++) {
		//배열 크기만큼 반복
			score[i] = (int)(Math.random()*100);
			//배열에 랜덤숫자를 하나씩 집어넣는다
			System.out.println("score["+i+"] = " + score[i]);
			sum = sum + score[i];
			//숫자들의 합 저장
		}
		System.out.println("== 총점 및 평균 ==");
		
		double avg = (double)sum/10;
		System.out.println("총합 = " + sum);
		System.out.println("평균 = " + avg);
	}
}
