package week9;

import java.util.Scanner;

public class Car2Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gasVal = 0;
		Car mycar = new Car();
		
		mycar.setGas(5);
		
		boolean gasState = mycar.isLeftGas();
		
		while (true) {
			if (gasState) {
				System.out.println("출발합니다.");
				mycar.run();
			}
			System.out.println("gas를 넣으세요 >> ");
			gasVal = sc.nextInt();
			
			if(gasVal == 0) {
				break;
			}
			mycar.setGas(gasVal);
			gasState = mycar.isLeftGas();
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
