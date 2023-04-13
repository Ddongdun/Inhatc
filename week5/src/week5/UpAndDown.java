package week5;

import java.util.Scanner;

public class UpAndDown {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//
		int result = (int)(Math.random()*100+1);
		//정답을 랜덤값으로 저장
		while(true) {
		//무한반복
			
			System.out.print("숫자를 맞혀 보세요(1~100) >> ");
			int answer = sc.nextInt();
			
			if(answer <= 0 || answer > 100) {
			//입력 범위를 벗어났을때
				System.out.println("1~100 사이의 값을 입력하세요");
			}
			else if (answer > result) {
			//입력값이 답보다 클때
				System.out.println("숫자가 너무 큽니다");
			}
			else if (answer < result) {
			//입력값이 답보다 작을때
				System.out.println("숫자가 너무 작습니다");
			}
			else {
				System.out.println("정답입니다. 랜덤 숫자는 " + result + "입니다.");
				break;
				//정답을 맞추면 
			}
			
		}
	}
}
