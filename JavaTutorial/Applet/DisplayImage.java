//second.java

import java.awt.*;
import java.applet.*;
//import java.awt.Graphics;

public class DisplayImage extends Applet
{
   Image picture;
  public void init()
  {
    picture=getImage(getDocumentBase(),"Chaman.jpg");
   
  }
  
   public void paint(Graphics g)
   {
	g.drawImage(picture,30,30,this);
   }

}