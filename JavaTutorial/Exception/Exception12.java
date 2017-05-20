class Exception12
{
   
        void m()throws IOException
         {
	   throw new IOException("device error");//checked exception
         }
	
	void n()throws IOException
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
           Exception12 obj=new Exception12();
           obj.p();
           System.out.println("Normal flow...");
         }
    }
 
  

  
}