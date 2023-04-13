package week6;

public class Reference1 {
	public static void main(String[] args) {
		int iVal1 = 100;
		int iVal2 = 100;
		System.out.println("iVal1 == iVal2 : " + (iVal1 == iVal2));
		//
		
		String sVal1 = "java";
		String sVal2 = "java";
		System.out.println("sVal1 == sVal2 : " + (sVal1 == sVal2?"참조가 같다":"참조가 다름"));	
		//참조 타입의 변수는 스택영역에 저장되면서 해당 객체의 주소를 저장
		//자바는 문자열 리터럴이 동일하면  String 객체를 공유 => 같은 주소를 가짐
		
		String sVal5 = null;
		//System.out.println("sVal5.length = " + sVal5.length());
		//참조 타입의 변수는 초기값으로 null을 사용할 수 있다
		//참조 타입의 변수가 null값을 가지고 있을 때는 해당 변수를 사용할 수 없다
		//값을 대입하는 순간 힙영역에 객체가 생성 => 스택영역에 주소 저장
		sVal5 = "java";
		System.out.println("sVal5 = " + sVal5);
		System.out.println("sVal1 == sVal5 : " + (sVal1==sVal5?"참조가 같다":"참조가 다름"));
		
		String sVal3 = new String("java");
		String sVal4 = new String("java");
		System.out.println("sVal3 == sVal4 : " + (sVal3==sVal4?"참조가 같다":"참조가 다름"));
		//new 연산자를 이용해서 String 객체 생성 => 힙 영역에 새로운 String 객체 생성
		
		if (sVal3.equals(sVal4)) {
			System.out.println("sVal3와 sVal4는 문자열이 동일하다.");
		}else {
			System.out.println("sVal3와 sVal4는 문자열이 다르다");
		}
		//String 객체가 동일한 문자열을 가지고 있는지 비교할 경우 반드시 equals() 메소드 사용
	}
}
