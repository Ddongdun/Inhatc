package week13;

public class BeepTask implements Runnable{
//Runnable 인터페이스 상속

	@Override
	public void run() {
	//run 메소드 재정의
		for (int i=0; i<5; i++) {
		//5번 반복
			System.out.println("삐~");
			//출력
			try {
				Thread.sleep(1000);
				//1초 쉰다
			} catch (InterruptedException e) {}
		}
	}
	
}
