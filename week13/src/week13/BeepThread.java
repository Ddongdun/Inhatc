package week13;

public class BeepThread extends Thread{
//Thread 클래스 상속
	@Override
	public void run() {
	//run 메소드 재정의
		for (int i=0; i<5; i++) {
		//5번 반복
			System.out.println("삐~");
			//출력
			try {
				Thread.sleep(1000);
				//1초 딜레이
			} catch (InterruptedException e) {}
		}
	}
}
