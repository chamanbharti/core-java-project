class A
{
  
  interface Message
  {
    void msg();
  }
}

class Test_A implements A.Message
{
  public void msg()
  {
    System.out.println("Hello Nested interface");
  }
  public static void main(String[] args)
  {
    A.Message message=new Test_A();//upcasting here
    message.msg();
  }
}