class Exception13
{
   
        void method()throws IOException
         {
	   throw new IOException("device error");//checked exception
         }
	
	
}

        class Test
        {
          public static void main(String args[])
          {
           try
           {
             Test t=new Test();
              t.method();
              //;
            }

            catch(Exception e)
             {

		System.out.println("Exception handled...")
             }

		System.out.println("Normal flow...")
          }
        }
 
  

  
