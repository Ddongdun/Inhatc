package week13;

public class BeepPrintEx {
	public static void main(String[] args) throws InterruptedException {
		for (int i=0; i<5; i++) {
		//5번 반복
			System.out.println("삐~");
			//출력
			Thread.sleep(1000);
			//ms 단위
		}
		
		for (int i=0; i<5; i++) {
		//스레드 단위로 위 작업이 종료되면 5번 실행
			System.out.println("******");
			//출력
			Thread.sleep(1000);
			//1초 딜레이
		}
	}
}
