package week3;

public class OneOperand2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		//++ 연산자는 피연산자의 기존 값에 1을 더해서 그 결과를 자신한테 저장
		//++ 기호가 피연산자의 오른쪽에 있으면 문장을 실행한 뒤에 1을 더한다.
		System.out.println("x++ = " + x++);
		//x++ = 10
		System.out.println("++X = " + ++x);
		//++X = 12
		
		z = x++; //x = 12
		System.out.println("z = " + z + ", x = " + x);
		//z = 12, x = 13
		
		z = ++x + y--;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
