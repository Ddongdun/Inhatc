package week6;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		//정수형 배열에 값을 넣는다
		int[] arr2 = new int[7];
		//7의 크기를 갖는 정수형 배열 선언
		
		//for문을 이용한 복사
		for(int i = 0; i<arr1.length;i++) {
		//arr1의 크기만큼 반복
			arr2[i] = arr1[i];
			//arr2에 arr1의 값을 하나씩 집어넣는다
		}
		for(int i = 0; i<arr2.length;i++) {
		//arr2의 크기만큼 반복
			System.out.println(arr2[i] + " ");
			//집어넣은 값 출력
		}
		
		System.out.println();
		//System.arraycopy() 메소드 이용
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		for(int i = 0; i<arr2.length;i++) {
			System.out.println(arr2[i] + " ");	
		}
		
		System.out.println();
		//Arrays 클래스 이용
		arr2 = Arrays.copyOf(arr1, 3);
		for(int i = 0; i<arr2.length;i++) {
			System.out.println(arr2[i] + " ");	
		}
	}
}
