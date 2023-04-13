package week4;

import java.util.Scanner;

public class BodyBMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력받기위해 스캐너 선언
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		//이름을 입력받는다
		
		System.out.print("키(cm)를 입력하세요 : ");
		int height = sc.nextInt();
		//키를 입력받는다
		
		System.out.print("몸무게(kg)를 입력하세요 :");
		int weight = sc.nextInt();
		//몸무게를 입력받는다
		
		double bmi = weight / (height/100.0 * height/100.0);
		//bmi계산
		//키를 m로 변환하기위해 100으로 나눠준다
		
		System.out.println(name + "님의 키는 " + height + "cm이고, 몸무게는 " + weight + "kg입니다.");
		if (bmi >=30) {
		//bmi가 30이상
			System.out.printf("BMI 지수는 %.2f이고 고도비만입니다", bmi);
		} 
		else if (bmi <= 29.9 && bmi >= 25) {
		//bmi가 25이상이고 29.9이하일때
			System.out.printf("BMI 지수는 %.2f이고 비만입니다", bmi);
		} 
		else if (bmi <= 24.9 && bmi >=23) {
		//bmi가 23이상이고 24.9이하일때
			System.out.printf("BMI 지수는 %.2f이고 과체증입니다", bmi);
		} 
		else if (bmi <=22.9 && bmi >=18.5) {
		//bmi가 18.5이상이고 22.9
			System.out.printf("BMI 지수는 %.2f이고 정상입니다", bmi);
		}
	}
}
