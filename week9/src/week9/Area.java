package week9;

public class Area {
	double areaCal(double radius) {
	//더블 형식의 원의 넓이 구하는 함수
		return 3.14 * radius * radius;
		//radius를 매개변수로 받아 값 리턴
	}
	
	int areaCal(int width) {
	//넓이 구하는 함수
		return width * width;
		//width를 매개변수로 받아 값 리턴
	}
	int areaCal(int width, int height) {
	//부피 구하는 함수
		return width * height;
		//width와 height를 매개변수로 받아 값 리턴
	}
}
