package week12;

import java.util.Scanner;

public class SmartPhoneEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력 받을 스캐너
		
		int menu;
		//메뉴 변수
		
		SmartPhone sp = new SmartPhone();
		//SmartPhone 클래스 선언
		EarPhone ep = null;
		//EarPhone 클래스 선언
		
		System.out.println("=== 스마트 폰으로 음악을 재생하기 ===");
		//출력
		
		while(true) {
		//무한반복
			System.out.print("\n연결할 이어폰을 선택하세요.(1. Buds 2. AirPods 3. TonFree 4. 종료) >> ");
			//출력
			menu = sc.nextInt();
			//메뉴 입력받음
			
			if (menu == 4) {
			//4를 입력받으면
				break;
				//종료
			}
			
			switch(menu) {
			//menu값에 따른 case 실행
			case 1:
			//1번
				ep = new Buds();
				//ep에 Buds클래스 형변환
				break;
				//종료
			case 2:
			//2번
				ep = new AirPods();
				//ep에 AirPods 클래스 형변환
				break;
				//종료
			case 3:
			//3번
				ep = new TonFree();
				//ep에 TonFree 클래스 형변환
				break;
				//종료
			}
			
			sp.musicon(ep);
			//ep값에 따른 재생 메소드 실행
			sp.musicoff(ep);
			//ep값에 따른 멈춤 메소드 실행
		}
	}
}
