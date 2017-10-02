import java.util.*;

interface Attack{
	void setAttack(String str);
	void printAttack();
}

class Naruto implements Attack, Cloneable {
	private String attack;
	
	public Naruto(){

	}
	
	public Naruto(String str){
		this.attack = str;
	}


	@Override
	public void setAttack(String str){
		this.attack = str;
	}

	@Override
	public void printAttack(){
		System.out.println(attack);
	}

	public Naruto ShadowClone() throws CloneNotSupportedException {
		return (Naruto) super.clone();
	}
}

public class Main{
	public static void main(String[] args) throws CloneNotSupportedException {
		Naruto naruto = new Naruto();
		ArrayList<String> attackList = new ArrayList<String>(Arrays.asList("RasenShuriken","Rasengan","Summoning Technique","Toad Oil Flame Bullet","Chibaku Tensei"));
		for(int i=0;i<attackList.size();i++){
			Naruto narutoClone = naruto.ShadowClone();
			naruto.setAttack(attackList.get(i));
			naruto.printAttack();
		}
	}
}