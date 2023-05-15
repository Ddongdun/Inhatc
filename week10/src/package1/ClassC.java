package package1;
import week10.ClassA;

public class ClassC {
	ClassA c1 = new ClassA(true);
	//패키지가 달라도 public은 호출 가능
	//ClassA c2 = new ClassA(10);
	//패키지가 다르면 default는 호출 불가
	//ClassA c3 = new ClassA("문자열");

}
