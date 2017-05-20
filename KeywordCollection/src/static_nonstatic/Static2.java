package static_nonstatic;
class Static2
{
  //int count=0;//will get memory when instance is created
  static int count=0;//will get memory only once and retain its value
  
  Static2()
  {
    count++;
    //++count;
    System.out.println(count);
  }
  
  public static void main(String[] args)
  {
	  Static2 s1=new Static2();
	  Static2 s2=new Static2();
	  Static2 s3=new Static2();
  }

}
