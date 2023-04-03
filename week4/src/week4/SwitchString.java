package week4;

public class SwitchString {
	public static void main(String[] args) {
		String mobile = "iPhone";
		switch(mobile) {
		case "iPhone" -> System.out.println("애플");
		case "Galaxy" -> System.out.println("삼성");
		default -> System.out.println("기타");
		}
	}
}
