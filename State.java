import java.util.*;
import java.io.*;

interface SaiyanMode {
	public void revealYourMode(StateContext state);
}

class Saiyan implements SaiyanMode {
	@Override
	public void revealYourMode(StateContext state){
		System.out.println("I'm in Saiyan Mode");
		state.changeMode(new GreatApe());
	}
}

class GreatApe implements SaiyanMode {
	@Override
	public void revealYourMode(StateContext state){
		System.out.println("I'm in Great Ape Mode");
		state.changeMode(new SuperSaiyan());
	}
}

class SuperSaiyan implements SaiyanMode {
	@Override
	public void revealYourMode(StateContext state){
		System.out.println("I'm in Super Saiyan Mode");
		state.changeMode(new Saiyan());
	}
}

class StateContext {
	private SaiyanMode currentMode;

	public StateContext(){
		this.currentMode = new Saiyan();
	}

	public void changeMode(SaiyanMode mode){
		this.currentMode = mode;
	}

	public void revealYourMode(){
		this.currentMode.revealYourMode(this);
	}
}

class Main {
	public static void main(String[] args){
		StateContext goku = new StateContext();
		goku.revealYourMode();
		goku.revealYourMode();
		goku.revealYourMode();
		goku.revealYourMode();
	}
}