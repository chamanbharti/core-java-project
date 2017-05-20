package composition;

class Maruti extends Car{  
	  
    //Maruti extends Car and thus inherits all methods from Car (except final and static)  
    //Maruti can also define all its specific functionality  
    public void MarutiStartDemo(){  
    	//Maruti class uses Engine object’s start() method via composition. We can say that Maruti class HAS-A Engine.
        Engine MarutiEngine = new Engine();  //composition
  
        MarutiEngine.start();  
        MarutiEngine.stop(); 
  
        }  
    }  
