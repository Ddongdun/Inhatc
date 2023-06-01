package week13;

public class BeepThreadEx {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new BeepThread();
		//스레드 생성자 선언
		thread.start();
		//스레드 시작
		
		//메인스레드
		for (int i=0; i<5; i++) {
		//5번 반복
			System.out.println("******");
			//출력
			Thread.sleep(1000);
			//1초 딜레이
		}
	}
}
