class GothamSuperHero{
  private static final GothamSuperHero batman = new GothamSuperHero();

  private GothamSuperHero(){}

  public static GothamSuperHero getBatman(){
    System.out.println("Batman to rescue");
    return batman;
  }

}

public class Main{
  public static void main(String[] args){
    GothamSuperHero.getBatman();
  }
}
