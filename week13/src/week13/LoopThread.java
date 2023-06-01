package week13;

public class LoopThread extends Thread {
//Thread 클래스 상속
	public LoopThread(String name) {
	//클래스 생성자
		setName(name);
		//setter
	}
	
	@Override
	public void run() {
	//run 메소드 재정의
		System.out.println(getName());
		//getter 출력
	}
}
