package week13;

public class DataBox {
//공유 자원 클래스
	private String data;
	//공유 자원 필드

	public synchronized String getData() {
	//소비자 스레드가 데이터를 읽어오는 부분 처리
		if (this.data == null) {
		//data가 null이라면
			try {
				wait();
				//소비자 스레드를 일시정지 상태로 만듬
			} catch (InterruptedException e) {}
		}
		String returnValue = data;
		//data를 리턴할 변수에 저장
		System.out.println("Consumer 스레드가 읽은 데이터 : " + returnValue);
		//출력
		data = null;
		//데이터를 null로 비우고 생산자 스레드를 실행 대기 상태로 만든다
		notify();
		//wait 상태 해제
		return returnValue;
		//data 리턴
	}

	public synchronized void setData(String data) {
	//생산자 스레드가 데이터를 쓰는 부분 처리
		if (this.data != null) {
		//data가 null이 아니라면
			try {
				wait();
				//다른 스레드에서 지정하지 못하도록 lock상태로 전환
			} catch (InterruptedException e) {}
		}
		
		this.data = data;
		//data를 넣고 소비자 스레드를 실행 대기상태로 만든다
		System.out.println("Producer 스레드가 생성한 데이터 : " + data);
		//출력
		notify();
		//wait상태 해제
	}
	
}
