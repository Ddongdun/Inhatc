package week9;

import java.util.Scanner;

public class Car2Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력받을 스캐너 선언
		int gasVal = 0;
		//연료 변수
		Car mycar = new Car();
		//Car 클래스 선언
		
		mycar.setGas(5);
		//연료를 5만큼 준다
		
		boolean gasState = mycar.isLeftGas();
		//연료가 있는지 체크하는 변수
		
		while (true) {
		//무한반복
			if (gasState) {
			//연료가 있다면
				System.out.println("출발합니다.");
				//출발
				mycar.run();
				//연료가 0이될때까지 달린다
			}
			System.out.println("gas를 넣으세요 >> ");
			//연료 넣는 안내문
			gasVal = sc.nextInt();
			//연료를 입력받는다
			
			if(gasVal == 0) {
			//0을 입력받으면
				break;
				//탈출
			}
			mycar.setGas(gasVal);
			//입력받은 가스를 넣는다
			gasState = mycar.isLeftGas();
			//연료가 0인지 확인하는 메소드의 결과값을 담는 변
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
