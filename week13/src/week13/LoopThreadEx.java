package week13;

public class LoopThreadEx {
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
		//10번 반복
			Thread thread = new LoopThread("thread_" + i);
			//스레드 생성자 선언
			
			if(i != 10) {
			//10번째가 아니라면
				thread.setPriority(Thread.MIN_PRIORITY);
				//가장 낮은 우선순위 설정
			}
			else {
			//그렇지 않다면
				thread.setPriority(Thread.MAX_PRIORITY);
				//가장 높은 우선순위 설정
			}
			thread.start();
			//스레드 시작
		}
	}
}
