package week4;

public class Switch1 {
	public static void main(String[] args) {
		int time = (int) (Math.random() * 4 + 8);
		System.out.println("[현재 시간 : " + time + "시]");

		switch (time) {
		case 8:
			System.out.println("출근 중입니다");
			break;
		case 9:
			System.out.println("회의 시간입니다");
			break;
		case 10:
			System.out.println("근무 중입니다");
			break;
		default:
			System.out.println("출장 중입니다");
		}

	}
}
