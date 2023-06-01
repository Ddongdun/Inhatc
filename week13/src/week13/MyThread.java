package week13;

public class MyThread extends Thread{
//Thread 클래스 상속
	private int x;
	//private 필드
	
	public MyThread(int x) {
	//생성자 선언
		this.x = x;
		//자기 자신의 x값을 넣는다
		setDaemon(true);
		//데몬스레드로 지정
	}
	
	@Override
	public void run() {
	//run 메소드 재정의
		for (int i=0; i<5; i++) {
		//5번 반복
			System.out.println(x + "번째 스레드입니다.");
			//출력
			try {
				Thread.sleep(1000);
				//1초 딜레이
			} catch (InterruptedException e) {}
		}
	}
}
