package week13;

public class BeepTaskEx {
	public static void main(String[] args) throws InterruptedException {
		Runnable beepTask = new BeepTask();
		//Runnable로 beepTask 생성자 선언
		Thread thread = new Thread(beepTask);
		//인터페이스를 매개값으로 갖는 Thread 생성자 호출
		thread.start();
		//beepTask 스레드 시작
		
		for (int i=0; i<5; i++) {
		//또 다른 작업을 5번 반복
			System.out.println("******");
			//출력
			Thread.sleep(1000);
			//1초 딜레이
		}
	}
}
