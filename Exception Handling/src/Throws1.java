import java.io.IOException;


class Throws1
{
   
        void m()throws IOException
         {
	      throw new java.io.IOException("device error");//checked exception
         }
	
	   void n() throws IOException
         {
	       m();
         }

          void p()
          {
            try
             {
               n();
             }
             
             catch(Exception e)
              {
                System.out.println("Exception handled");
              }
          }

         public static void main(String args[])
         {
        	 Throws1 obj=new Throws1();
           obj.p();
           System.out.println("Normal flow...");
         }
    }