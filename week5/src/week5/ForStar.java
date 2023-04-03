package week5;

public class ForStar {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 10 + 1);
		//1~10까지의 정수
		
		System.out.println("랜덤 숫자 : " + num);
		
		for(int i = 1; i <= num ; i++)
			System.out.println("★");
	}
}
