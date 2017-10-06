/*
 * Ash on his way to catch Pokemons.
 */

import java.util.*;

class PokeBall {
	String pokemon;

	PokeBall(String poke){
		this.pokemon = poke;
	}

	String getPokemon(){
		return this.pokemon;
	}
}

class PokeMonHandler {
	String pokemon;

	void catchPokemon(String poke){
		this.pokemon = poke;
		System.out.println("We have catched "+ this.pokemon +" Pokemon");
	}

	PokeBall saveToPokeBall(){
		System.out.println("You now have "+this.pokemon+" Pokemon");
		return new PokeBall(this.pokemon);
	}

	void getFromPokeBall(PokeBall ball){
		this.pokemon =  ball.getPokemon();
		System.out.println(this.pokemon +" Pokemon is now ready to fight");
	}

}


class PokeBag {

	HashMap<String,PokeBall> pokeList = new HashMap<String,PokeBall>();
	void addPokeBall(PokeBall ball){
	    pokeList.put(ball.getPokemon(),ball);
	}

	PokeBall getPokeBall(String poke){
	   if(pokeList.containsKey(poke)){
	       return pokeList.get(poke);
	   } else {
	     return new PokeBall("Empty");   
	   }
	}
}

class Main {
	public static void main(String[] args){
		PokeBag bag = new PokeBag();
		PokeMonHandler ash = new PokeMonHandler();
		ash.catchPokemon("MewTwo");
		ash.catchPokemon("Arceus");
		bag.addPokeBall(ash.saveToPokeBall());
		ash.catchPokemon("Giratina");
		bag.addPokeBall(ash.saveToPokeBall());
		ash.catchPokemon("Dragonite");
		bag.addPokeBall(ash.saveToPokeBall());
		ash.catchPokemon("Charizard");
		bag.addPokeBall(ash.saveToPokeBall());
		ash.getFromPokeBall(bag.getPokeBall("Charizard"));
	}
}


/*  OUTPUT
We have catched MewTwo Pokemon
We have catched Arceus Pokemon
You now have Arceus Pokemon
We have catched Giratina Pokemon
You now have Giratina Pokemon
We have catched Dragonite Pokemon
You now have Dragonite Pokemon
We have catched Charizard Pokemon
You now have Charizard Pokemon
Charizard Pokemon is now ready to fight

*/