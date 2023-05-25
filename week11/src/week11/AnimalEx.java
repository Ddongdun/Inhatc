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
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("----------");
		
		animalSound(new Dog());
		animalSound(new Cat());
	}

	private static void animalSound(Animal animal) {
		animal.sound();
		animal.breathe();
		
		if(animal instanceof Dog) {
			System.out.println("Dog 객체로 casting 변환 가능");
			Dog dog = (Dog)animal;
			dog.dogLife();
		}
		else if(animal instanceof Cat) {
			System.out.println("Cat 객체로 casting 변환 가능");
			Cat cat = (Cat)animal;
			cat.catLife();
		}
		
	}
}	
