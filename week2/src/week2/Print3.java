package week2;

public class Print3 {
	public static void main(String[] args) {
		System.out.print(17+35);
		System.out.println("17+35");
		System.out.println("17+35="+17+35);
		System.out.println("17+35="+(17+35));
		/*
		 * println, print, printf
		 * 문자열 출력 포맷(printf)
		 * %s : 문자열 출력
		 * \n : 줄바꿈
		 */
		System.out.printf("이름 : %s, %s\n", "자바", "이클립스");
		/*
		5217+35
		17+35=1735
		17+35=52
		이름 : 자바, 이클립스
		*/
		//System.out.printf("이름 : %s, %s\n", "자바");
	}
}
