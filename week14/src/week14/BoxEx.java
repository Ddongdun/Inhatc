package week14;

public class BoxEx {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		//T대신 String값을 넣어 String객체가 된다
		box.setT("Hello");
		//private 변수 t에 String 타입 Hello를 넣는다
		String str = box.getT();
		//str에 getter로 t의 값을 가져온다
		System.out.println(str);
		//가져온 값 출력
		
		Box<Integer> box2 = new Box<>();
		//T대신 Integer값을 넣어 int객체가 된다
		//box2.setT("100");
		//Integer로 선언해 문자열은 들어갈 수 없다
		box2.setT(100);
		//private 변수 t에 int 타입 100을 넣는다
		System.out.println(box2.getT());
		//getter로 t의 값을 가져와 출력
	}
}
