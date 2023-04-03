package week4;

public class SwitchCharEx {
	public static void main(String[] args) {
		char grade = 'B';

		switch (grade) {

		case 'A':
		case 'a':
			System.out.println("우수 회원");
			break;

		case 'B':
		case 'b':
			System.out.println("일반 회원");
			break;
		default:
			System.out.println("손님");
		}

		switch (grade) {

		case 'A', 'a' -> {
			System.out.println("우수 회원");
		}
		case 'B', 'b' -> {
			System.out.println("일반 회원");
		}
		default -> {
			System.out.println("손님");
		}
		}

		switch (grade) {
		case 'A', 'a' -> System.out.println("우수 회원");
		case 'B', 'b' -> System.out.println("일반 회원");
		default -> System.out.println("손님");
		}
	}
}
