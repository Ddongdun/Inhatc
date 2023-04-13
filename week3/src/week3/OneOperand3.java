package week3;

public class OneOperand3 {
	public static void main(String[] args) {
		int var1 = 10;
		int var2 = ~var1;
		//var1의 비트 값을 반전
		int var3 = ~var1 + 1;
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
		//정수형 타입은 부호가 존재할 때 양수보다 음수가 1크기 때문에 -11이 나온
		//var1 = 10
		//var2 = -11
		//var3 = -10
		
		System.out.printf("십진수(%d) : %32s\n", var1, Integer.toBinaryString(var1));
		System.out.printf("십진수(%d) : %32s\n", var2, Integer.toBinaryString(var2));
		//십진수(10) :                             1010
		//십진수(-11) : 11111111111111111111111111110101
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);
		//JDK33.0
		//6.0JDK

	}
}
