package week13;

public class ThreadABEx {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		//현재 작동중인 스레드를 가져옴
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread);
		//항상 첫 시작은 메인 스레드
		
		ThreadA threadA = new ThreadA();
		//ThreadA 생성자
		threadA.start();
		//ThreadA 시작
		System.out.println("작업 스레드 이름 : " + threadA.getName());
		//ThreadA의 getter
		
		ThreadB threadB = new ThreadB();
		//ThreadB 생성자
		threadB.start();
		//ThreadB 시작
		System.out.println("작업 스레드 이름 : " + threadB.getName());
		//ThreadB의 getter
	}
}
