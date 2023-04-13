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
		//x에는 11이 담긴다
		System.out.println("++X = " + ++x);
		//++X = 12
		//x를 미리 1더하고 출력하므로 x에는 12가 담긴
		
		z = x++; 
		z에 x를 담고 더하므로 z에는 12가 담기고 x는 1증가한 13이 된다.
		System.out.println("z = " + z + ", x = " + x);
		//z = 12, x = 13
		
		z = ++x + y--;
		//z에 x를 더하고 담으므로 x는 14가된다.
		//z에 y를 담고 빼므로 z에는 10, y에는 9가 담긴다.
		//z의 합은 14 + 10 = 24
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		/*
		z = 24
		x = 14
		y = 9
		*/
	}
}
