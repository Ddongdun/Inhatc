package week9;

public class AreaEx {
	public static void main(String[] args) {
		Area obj = new Area();
		
		double r1 = obj.areaCal(10.5);
		System.out.println("원의 넓이 = " + r1);
		
		int r2 = obj.areaCal(12);
		System.out.println("정사각형의 넓이 = " + r2);
		
		int r3 = obj.areaCal(6, 7);
		System.out.println("직사각형의 넓이 = " + r3);
	}
}
