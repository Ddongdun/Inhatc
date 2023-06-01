package week13;

public class ProducerThread extends Thread{
//Thread 클래스 상속
	DataBox dataBox;
	//공유자원 클래스 선언
	
	public ProducerThread(DataBox dataBox) {
	//생산자 클래스 생성자 선언
		this.dataBox = dataBox;
		//dataBox를 필드에 저장
	}
	
	@Override
	public void run() {
	//run 메소드 재정의
		for(int i=1; i<=3; i++) {
		//3번 반복
			String data = "Data-" + i;
			//공유자원에 넘길 데이터
			dataBox.setData(data);
			//공유자원으로 넘긴다
		}
	}
}
