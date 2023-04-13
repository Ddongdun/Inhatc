package week5;

public class Break {
	public static void main(String[] args) {
		while(true) {
		//무한반복
			int num = (int)(Math.random() * 10);
			//0~10까지의 랜덤 숫자
			
			System.out.println("랜덤 숫자 : " + num);
			
			if(num == 7) {
			//숫자로 7이 나오면
				System.out.println("프로그램 종료");
				break;
				//
			}
		}
	}
}
