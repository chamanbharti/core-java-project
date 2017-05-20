package Thread;
class Simple1 extends Thread
{
	long minPrime;
	Simple1(long minPrime){
		this.minPrime=minPrime;
	}
  public void run()
  {
    System.out.println("Min Prime is "+minPrime);
  }
}

class Simple2 implements Runnable
{
	long prime;
	Simple2(long prime){
		this.prime=prime;
	}
  public void run()
  {
    System.out.println("Prime is "+prime);
  }
}

class Test
{
  public static void main(String[] args)
  {
    Simple1 t1=new Simple1(143);
    t1.start();
    
    //execute runnable
    Simple2 t2=new Simple2(143);
    Thread t = new Thread(t2);
    t.start();
    // simple way
    new Thread(t2).start();
    
  }
 
}