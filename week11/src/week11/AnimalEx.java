package week11;

public class AnimalEx {
	public static void main(String[] args) {
		Dog dog = new Dog();
		//Dog 생성자 선언
		Cat cat = new Cat();
		//Cat 생성자 선언
		dog.sound();
		//dog 메소드 출력
		cat.sound();
		//cat 메소드 출력
		System.out.println("----------");
		//줄바꿈
		
		Animal animal = null;
		//animal 생성자 선언
		animal = new Dog();
		//animal을 Dog로 자동형변환
		animal.sound();
		//Dog의 메소드 출력
		animal = new Cat();
		//animal을 Cat으로 자동형변환
		animal.sound();
		//Cat의 메소드 출력
		System.out.println("----------");
		//줄바꿈
		
		animalSound(new Dog());
		//Dog로 animalSound 메소드 실행
		animalSound(new Cat());
		//Cat으로 animalSound 메소드 실행
	}

	private static void animalSound(Animal animal) {
	//정적 메소드
		animal.sound();
		//sound 메소드 실행
		animal.breathe();
		//breathe 메소드 실행
		
		if(animal instanceof Dog) {
		//animal의 객체 타입이 Dog 라면
			System.out.println("Dog 객체로 casting 변환 가능");
			//출력
			Dog dog = (Dog)animal;
			//animal을 Dog로 강제형변환
			dog.dogLife();
			//dog 설명 메소드 실행
		}
		else if(animal instanceof Cat) {
		//animal의 객체 타입이 cat이라면
			System.out.println("Cat 객체로 casting 변환 가능");
			//출력
			Cat cat = (Cat)animal;
			//animal을 Cat으로 강제형변환
			cat.catLife();
			//cat 설명 메소드 실
		}
		
	}
}	
