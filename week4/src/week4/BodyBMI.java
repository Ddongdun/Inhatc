package week4;

import java.util.Scanner;

public class BodyBMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.print("키(cm)를 입력하세요 : ");
		int height = sc.nextInt();
		
		System.out.print("몸무게(kg)를 입력하세요 :");
		int weight = sc.nextInt();
		
		double bmi = weight / (height/100.0 * height/100.0);
		
		System.out.println(name + "님의 키는 " + height + "cm이고, 몸무게는 " + weight + "kg입니다.");
		if (bmi >=30) {
			System.out.printf("BMI 지수는 %.2f이고 고도비만입니다", bmi);
		} else if (bmi <= 29.9 && bmi >= 25) {
			System.out.printf("BMI 지수는 %.2f이고 비만입니다", bmi);
		} else if (bmi <= 24.9 && bmi >=23) {
			System.out.printf("BMI 지수는 %.2f이고 과체증입니다", bmi);
		} else if (bmi <=22.9 && bmi >=18.5) {
			System.out.printf("BMI 지수는 %.2f이고 정상입니다", bmi);
		}
	}
}
