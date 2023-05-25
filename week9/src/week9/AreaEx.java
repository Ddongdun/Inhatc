package week9;

public class AreaEx {
	public static void main(String[] args) {
		Area obj = new Area();
		//Area 클래스를 생성
		
		double r1 = obj.areaCal(10.5);
		//원의 넓이를 구하는 함수 값을 r1에 저장
		
		System.out.println("원의 넓이 = " + r1);
		//출력
		
		int r2 = obj.areaCal(12);
		//정사각형의 넓이를 구하는 함수 값을 r2에 저장
		System.out.println("정사각형의 넓이 = " + r2);
		//출력
		
		int r3 = obj.areaCal(6, 7);
		//직사각형의 넓이를 구하는 함수 값을 r3에 저장
		System.out.println("직사각형의 넓이 = " + r3);
		//출력
	}
}
