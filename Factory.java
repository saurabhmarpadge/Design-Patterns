interface SuperHero{
  public void Fly();
  public void Attack();
}

class Marvel implements SuperHero{
  @Override
  public void Fly(){
    System.out.println("Here, I'm in the Air!!!");
  }

  @Override
  public void Attack(){
    System.out.println("Super Punch");
  }
}

class DC implements SuperHero{
  @Override
  public void Fly(){
    System.out.println("Jet's On!");
  }

  @Override
  public void Attack(){
    System.out.println("Energy Blast");
  }
}

class SuperHeroFactory {
	public static SuperHero createSuperHero(String input){
		SuperHero hero = null;
		if(input.equals("Marvel")){
			hero = new Marvel();
		}else if(input.equals("DC")){
			hero = new DC();
		}
		return hero;
	}
}

public class Main{
  public static void main(String[] args){
    SuperHero superMan = SuperHeroFactory.createSuperHero("Marvel");
    superMan.Fly();
    superMan.Attack();
    SuperHero ironMan = SuperHeroFactory.createSuperHero("DC");
    ironMan.Fly();
    ironMan.Attack();
  }
}
