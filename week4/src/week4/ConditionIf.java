package week4;

import java.util.Scanner;

public class ConditionIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신이 태어난 연도를 입력하세요 >> ");
		
		int year = sc.nextInt();
		
		int age = 2023 - year;
		//나이 계산
		
		if(age <= 26) {
			//나이가 26이하이고
			if(age >= 20)
				//20이상이면
				System.out.println("대학생");
			
		else if(age < 20) 
			//나이가 20이하이고
			if(age >= 17)
				//17이상이면
				System.out.println("고등학생");
			
		else if(age < 17) 
			//나이가 17이하이고
			if(age >= 14)
				//14이상이면
				System.out.println("중학생");
	
		else if(age < 14) 
			//나이가 14이하이고
			if(age >= 8)
				//8이상이면
				System.out.println("초등학생");
	
		else
			System.out.println("학생이 아닙니다");
		}
	}
}
