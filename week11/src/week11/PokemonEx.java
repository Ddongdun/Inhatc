package week11;

public class PokemonEx {
	public static void main(String[] args) {
		Pokemon[] pokemon = new Pokemon[3];
		pokemon[0] = new Pikachu();
		pokemon[1] = new Pairi();
		pokemon[2] = new Purin();
		
		for(Pokemon p : pokemon) {
			p.name();
			p.attack();
			p.passive();
		}
	}
}
