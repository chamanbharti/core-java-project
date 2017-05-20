package StaticBlockNonStaticBlock;
//http://www.javamadesoeasy.com/2015/06/differences-between-instance.html
public class MyClass {
	/* Static block */
    static {
           System.out.println("static block");
    }
 
 
    /* Non-Static block (Instance block) */
    {
           System.out.println("instance/non-static block");
    }
 
    /* Constructor */
    MyClass() {
           System.out.println("MyClass constructor");
    }
 
}
