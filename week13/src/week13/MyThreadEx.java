package week13;

public class MyThreadEx {
	public static void main(String[] args) {
		for (int i=1; i<100; i++) {
		//100번 반복
			MyThread thread = new MyThread(i);
			//MyThread 생성자 선언
			thread.start();
			//스레드 시작
		}
	}
}
