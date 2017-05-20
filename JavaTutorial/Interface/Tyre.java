
  interface Moveable
  {
    boolean isMoveable();
  }

   interface Rollable
  {
    boolean isRollable();
  }

class Tyre implements Moveable,Rollable
{
  int width;

 public boolean isMoveable()
  {
    return true;
  }

  public boolean isRollable()
  {
    return true;
  }

  public static void main(String[] args)
  {
     Tyre tr=new Tyre();
     System.out.println(tr.isMoveable());
     System.out.println(tr.isRollable());
  }
}