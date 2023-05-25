package week11;

public class PokemonEx {
	public static void main(String[] args) {
		Pokemon[] pokemon = new Pokemon[3];
		//Pokemon 클래스를 배열로 선언 
		pokemon[0] = new Pikachu();
		//Pikachu 클래스 선언 
		pokemon[1] = new Pairi();
		//Pairi 클래스 선언 
		pokemon[2] = new Purin();
		//Purin 클래스 선언 
		
		for(Pokemon p : pokemon) {
		//pokemon 배열의 원소 개수만큼 반복
			p.name();
			//추상 메소드1 출력
			p.attack();
			//추상 메소드2 출력
			p.passive();
			//추상 메소드3 출력 
		}
	}
}
