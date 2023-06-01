package week13;

public class BeepTaskEx2 {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable() {
		//Runnable 인터페이스를 매개값으로 갖는 생성자 호출
			@Override
			public void run() {
			//생성자 안에서 run메소드 재정의
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
		});
		//한 문장이므로 ;을 붙여준다
		thread.start();
		//스레드 시작
		
		for (int i=0; i<5; i++) {
		//멀티 스레드 작업 
			System.out.println("******");
			//출력
			Thread.sleep(1000);
			//1초 딜레이
		}
	}
}
