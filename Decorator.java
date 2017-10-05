import java.util.*;

abstract class Ironman {
	String description = "Ironman";
	String getDescription(){
		return description;
	}
}

class MarkIII extends Ironman {
	MarkIII(){
		description = description + " MarkIII";
	}
}
class MarkXLII extends Ironman {
	MarkXLII(){
		description = description + " MarkXLII";
	}
}

abstract class IronmanDecorator extends Ironman{
	 abstract String getDescription();
}

class Model11 extends IronmanDecorator {
	private Ironman ironman;
	 Model11(Ironman ironman){
		this.ironman = ironman;
	} 

	@Override
	 String getDescription(){
		return ironman.getDescription() + " War Machine Armor";
	}

	 void machineGun(){
		System.out.println("Bullets -> -> ->");
	}
}

class Model13 extends IronmanDecorator {
	private Ironman ironman;
	 Model13(Ironman ironman){
		this.ironman = ironman;
	} 

	@Override
	 String getDescription(){
		return ironman.getDescription() + " HulkBuster";
	}

	 void smash(){
		System.out.println("Boom Boom");
	}
}

class Model44 extends IronmanDecorator {
	private Ironman ironman;
	 Model44(Ironman ironman){
		this.ironman = ironman;
	} 

	@Override
	 String getDescription(){
		return ironman.getDescription() + " Heavy Duty Armor";
	}

	 void attack(){
		System.out.println("Missile");
	}
}

class Main{
	public static void main(String[] args) {
		Ironman tony = new MarkIII();
		System.out.println(tony.getDescription()); 

		Model11 tonyModel11 = new Model11(tony);
		System.out.println(tonyModel11.getDescription()); 
		tonyModel11.machineGun(); 

		Model13 tonyModel13 = new Model13(tonyModel11);
	    System.out.println(tonyModel13.getDescription());
		tonyModel13.smash(); 
	}
}