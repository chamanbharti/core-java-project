import java.awt.*;
import java.applet.*;

public class Demo extends Applet
{
	String s1,s2;
	public void init()
	{
		s1="Welcome to java tutorial";
		s2="on today "+new java.util.Date();
	}

	public void paint(Graphics g)
	{
		g.drawString(s1,50,50);
		g.drawString(s2,50,70);
		g.drawString("Best Wishes",50,90);//directly wrting a string
	}

	public void destroy()
	{
		s1=null;
		s2=null;
	}
}