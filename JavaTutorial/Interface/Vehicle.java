
  interface Moveable
  {
    int avg_speed=40;
    void move();
  }


class Vehicle implements Moveable
{
  public void move()
  {
    System.out.println("Average speed is "+avg_speed);
  }
  public static void main(String[] args)
  {
     Vehicle vc=new Vehicle();
     vc.move();
  }
}