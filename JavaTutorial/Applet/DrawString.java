import java.Applet.*;
import java.awt.*;

public class DrawString extends Applet
{
  private String str="Hello";

  public void paint(Graphics g)
  {
    String str=this.getparameter("Message");
    g.drawString(str,50,25);
  }
}