import java.io.*;

interface SuperHero {
	void saveCity();
}

interface SuperHeroFactory {
	SuperHero ProduceSuperHero();
}

class MarvelSuperHeroFactory implements SuperHeroFactory {
	MarvelSuperHero IronMan = new MarvelSuperHero("IronMan");
	public SuperHero ProduceSuperHero(){
		return IronMan;
	}
}

class DCSuperHeroFactory implements SuperHeroFactory {
	DCSuperHero SuperMan = new DCSuperHero("SuperMan");
	public SuperHero ProduceSuperHero(){
		return SuperMan;
	}
}

class MarvelSuperHero implements SuperHero {
    String name;
	MarvelSuperHero(String name){
	    this.name = name;
	}
	public void saveCity(){
		System.out.println("Don't worry "+ name + " is here!!!");
	}
}

class DCSuperHero implements SuperHero {
    String name;
	DCSuperHero(String name){
	    this.name = name;
	}
	public void saveCity(){
		System.out.println("Don't worry "+ name +" is here!!!");
	}
}

class CityInDanger {
	SuperHero hero;
	CityInDanger(SuperHeroFactory heroFactory){
		hero = heroFactory.ProduceSuperHero();
		hero.saveCity();
	}
}

		
class Main {
	public static void main(String[] args) {
		CityInDanger starCity = new CityInDanger(specifyFactory(0));
	}
	static SuperHeroFactory specifyFactory(int input){
		if(input==0){
			return new MarvelSuperHeroFactory();
		} else {
			return new DCSuperHeroFactory();
		}
	}
}