package week5;

public class ForDouble {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) { 
		//i = 1, 2, 3 
		//바깥 포문이 1번 반복될 때 마다
			for(int j=0; j<3; j++) {
			//안쪽 포문은 3번 반복된다
				System.out.println(" i = " + i + ", j = " + j);
				/*
				  	i = 0, j = 0
 					i = 0, j = 1
 					i = 0, j = 2
 					i = 1, j = 0
 					i = 1, j = 1
 					i = 1, j = 2
 					i = 2, j = 0
 					i = 2, j = 1
 					i = 2, j = 2
				 */
			}
		}
	}
}
