abstract class Player//abstract class
{
  private String name;
  public Player(String nm)
  { 
    name=nm;
  }

  public String getName()//regular method
  {
    return(name);
  }

  public abstract void Play();
  //abstract method:no implementation
}

class Cricket_Player extends Player
{
  Cricket_Player(String var)
  {

  }

  public void Play()
  {
    system.out.println("Play Cricket: "+getName());
  }
}

class Hockey_Player extends Player
{
  Hockey_Player(String var)
  {

  }

  public void Play()
  {
    system.out.println("Play Hockey: "+getName());
  }
}

class Football_Player extends Player
{
  Football_Player (String var)
  {

  }

  public void Play()
  {
    system.out.println("Play Football: "+getName());
  }
}

public class PolyDemo
{
  public static void main(String[] args)
  {
    Player ref;//set up var for an Player1
    
    Cricket_Player aCplayer=new Cricket_Player("Sachin");//makes specific objects
    Hockey_Player  aHplayer=new Hockey_Player("Bhanaraj");
    Football_Player aFplayer=new Football_Player("Bhutia");
    //now reference each as an Animal
    ref=aCplayer;
    ref.Play();
    ref=aHplayer;
    ref.Play();
    ref=aFplayer;
    ref.Play();
  }
}