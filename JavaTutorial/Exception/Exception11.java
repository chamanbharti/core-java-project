class Exception11
{
   
        void m()
         {
	   throw new java.io.IOException("device error");//checked exception
         }
	
	void n()
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
           Exception11 obj=new Exception11();
           obj.p();
           System.out.println("Normal flow...");
         }
    }
 
  

  
}