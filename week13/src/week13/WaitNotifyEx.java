package week13;

public class WaitNotifyEx {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		//공유자원 클래스 선언
		
		ProducerThread prod = new ProducerThread(dataBox);
		//생산자 클래스 생성자 선언
		ConsumerThread cons = new ConsumerThread(dataBox);
		//소비자 클래스 생성자 선언
		
		prod.start();
		//생산자 스레드 시작
		cons.start();
		//소비자 스레드 시작
	}
}
