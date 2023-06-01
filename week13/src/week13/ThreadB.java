package week13;

public class ThreadB extends Thread{
//Thread 클래스 상속
	public ThreadB() {
	//생성자
		setName("ThreadB");
		//setter로 스레드 이름 변경
	}
	@Override
	public void run() {
	//run 메소드 재정의
		for(int i=0; i<5; i++) {
		//5번 반복
			System.out.println(getName() + "작동 중...");
			//출력
		}
	}
}
