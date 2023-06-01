package week13;

public class ConsumerThread extends Thread{
//Thread 클래스 상속
	DataBox dataBox;
	//공유자원 클래스 선언
	
	public ConsumerThread(DataBox dataBox) {
	//소비자 클래스 생성자 선언
		this.dataBox = dataBox;
		//dataBox에 접근 가능
	}
	
	@Override
	public void run() {
	//run 메소드 재정의
		for (int i=1; i<=3; i++) {
		//3번 반복
			String data = dataBox.getData();
			//공유 자원을 가져온다
		}
	}
}
