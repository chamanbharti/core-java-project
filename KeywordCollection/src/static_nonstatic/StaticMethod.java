package static_nonstatic;

class StaticMethod
{
   private static int age=26;
   public void setAge(int a)
   {
      age=a;
   }
   public static int getAge()
   {
      return age;
   }
   public static void main(String args[])
   {
       System.out.println("Age is:"+ getAge());
   }
}
