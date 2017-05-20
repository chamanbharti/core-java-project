class Exception10
{
   
        void m()
         {
	       int data=50/0;//unchecked exception
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
           Exception10 obj=new Exception10();
           obj.p();
           System.out.println("Normal flow...");
         }
    }