package week14;

public class ProductEx {
	public static void main(String[] args) {
		Product<TV, String> prod1 = new Product<>();
		//Product 클래스를 TV 클래스, String 타입으로 생성자 선언
		prod1.setKind(new TV());
		//prod1의 kind를 new TV()로 설정
		prod1.setModel("Smart TV");
		//prod1의 model을 Smart TV로 설정
		
		TV tv = prod1.getKind();
		//TV tv = new TV();
		//prod1의 kind를 getter로 가져와 생성자 선언
		String tvmodel = prod1.getModel();
		//prod1의 모델을 getter로 가져와 저장
		tv.tvPrint();
		//TV 클래스의 tvPrint()메소드 실행
		System.out.println("==> " + tvmodel);
		//tvmodel 출력
		
		Product<Car, String> prod2 = new Product<>();
		//Product의 클래스를 Car 클래스, String 타입으로 생성자 선언
		prod2.setKind(new Car());
		//prod2의 kind를 new Car()로 설정
		prod2.setModel("그랜저");
		//prod2의 model을 그랜저로 설정
		
		Car car = prod2.getKind();
		//Car car = new Car();
		//prod2의 kind를 getter로 가져와 생성자 선언
		String carmodel = prod2.getModel();
		//prod2의 모델을 getter로 가져와 저장
		car.carPrint();
		//Car 클래스의 carPrint()메소드 실행
		System.out.println("==> " + carmodel);
		//carmodel 출력
	}
}
