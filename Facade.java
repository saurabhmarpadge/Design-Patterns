class Jarvis {
	void initiate(){
		System.out.println("Good Morning Sir, Jarvis at your service!");
	}
}

class Suit {
	void wear(){
		System.out.println("Suit Up!!!");
	}
}

class Thrusters {
	void turnOn(){
		System.out.println("Thrusters On!");
	}
}

class Ironman {
	Jarvis jarvis;
	Suit suit;
	Thrusters thrusters;
	Ironman(){
		jarvis = new Jarvis();
		suit = new Suit();
		thrusters = new Thrusters();
	}
	
	void call(){
		jarvis.initiate();
		suit.wear();
		thrusters.turnOn();
		System.out.println("No Fear when Ironman is here.");
	}
}

class Main{
	public static void main(String[] args){
		Ironman tony = new Ironman();
		tony.call();
	}
}