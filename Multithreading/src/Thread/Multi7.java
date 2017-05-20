package Thread;
//Can we start a thread twice

class Multi7 extends Thread
{
  public void run()
  {
   
    System.out.println("Running");
   
  }
  

   public static void main(String args[])
   {
       Multi7 t1=new Multi7();

       t1.start();
       //t1.start();
   }


}