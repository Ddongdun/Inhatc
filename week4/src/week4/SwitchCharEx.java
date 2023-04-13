package week4;

public class SwitchCharEx {
	public static void main(String[] args) {
		char grade = 'B';
		//grade값을 B로 준다

		switch (grade) {
		//grade값에 따라 다른 값 출

		case 'A':
		case 'a':
		//case 여러개를 같이 선언할 수 있다
		//여기서는 대문자와 소문자를 같이 묶음
			System.out.println("우수 회원");
			break;
			//break를 꼭 넣어줘야 무한반복되지않음

		case 'B':
		case 'b':
			System.out.println("일반 회원");
			break;
		default:
			System.out.println("손님");
		}

		switch (grade) {
		//스위치문의 다른 형식

		case 'A', 'a' -> {
		//->를 쓴 형식
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
		//괄호를 쓰지 않고 ->를 통해 바로 출력할 수 있다.
		case 'A', 'a' -> System.out.println("우수 회원");
		case 'B', 'b' -> System.out.println("일반 회원");
		default -> System.out.println("손님");
		}
	}
}
