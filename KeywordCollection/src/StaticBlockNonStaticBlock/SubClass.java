package StaticBlockNonStaticBlock;

class SubClass extends SuperClass {
    
    /* Static block */
    static {
           System.out.println("SubClass > static block");
    }
 
 
    /* Non-Static block (Instance block) */
    {
           System.out.println("SubClass > Instance/non-static block");
    }
 
    /* Constructor*/
    SubClass() {
           System.out.println("SubClass > constructor");
    }
 
}
