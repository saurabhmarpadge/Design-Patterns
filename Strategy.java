interface Strategy {
	public void analyseSuperVillain (String name);
}

class Billionaire implements Strategy {
	@Override
	public void analyseSuperVillain(String name){
		System.out.println("Give money and Settle Down");
	}
}

class Vigilante implements Strategy{
	@Override
	public void analyseSuperVillain(String name){
		System.out.println("Fight with "+name+" and then Settle Down");
	}
}

class Situation {
	Strategy saviourStrategy;

	Situation(Strategy saviour){
		this.saviourStrategy = saviour;
	}

	void handleIt(String superVillain){
		this.saviourStrategy.analyseSuperVillain(superVillain);
	}
}

class Main {
	public static void main(String[] args){
		Billionaire bruceWayne = new Billionaire();
		Vigilante batman = new Vigilante();

		Situation gothamInDanger = new Situation(bruceWayne);
		gothamInDanger.handleIt("Joker");
		Situation gothamInFire = new Situation(batman);
		gothamInFire.handleIt("Ra's al Ghul");
	}
}