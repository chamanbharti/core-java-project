package StaticBlockNonStaticBlock;

class SuperClass {
    
    /* Static block */
    static {
           System.out.println("SuperClass ----------> static block");
    }
 
 
    /* Non-Static block (Instance block) */
    {
           System.out.println("SuperClass ----------> Instance/non-static block");
    }
 
    /* Constructor*/
    SuperClass() {
           System.out.println("SuperClass ----------> constructor");
    }
 
}