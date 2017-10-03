class Arrow {
	public void getArrowColor(String str){
		System.out.println("Arrow color is "+str);
	}
}

class Speedy {
	public void getSpeedyColor(String str){
		System.out.println("Speedy color is "+str);
	}
}

class ArrowAdaptor extends Arrow {
	Speedy speedy = new Speedy();
	ArrowAdaptor(Speedy speedy){
		this.speedy = speedy;
	}
	
	public void getArrowColor(String str) {
		this.speedy.getSpeedyColor(str);
	}
}

class Main{
	public static void main(String[] args){
		Arrow oliver = new Arrow();
		oliver.getArrowColor("Green");
	
		Speedy speedy = new Speedy();
		ArrowAdaptor thea = new ArrowAdaptor(speedy);
		thea.getArrowColor("Red");
	}
}