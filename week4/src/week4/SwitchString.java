package week4;

public class SwitchString {
	public static void main(String[] args) {
		String mobile = "iPhone";
		//문자열 값 저장
		switch(mobile) {
		//mobile변수 값에 따른 case 작성
		case "iPhone" -> System.out.println("애플");
		case "Galaxy" -> System.out.println("삼성");
		//->를 이용해 바로 출력
		default -> System.out.println("기타");
		}
	}
}
