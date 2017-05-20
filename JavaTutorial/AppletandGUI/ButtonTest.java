import java.applet.*;
import java.awt.*;

public class ButtonTest extends Applet
{
	 Button b1=new Button("Play");
	 Button b2=new Button("Stop");

	public void init()
	{
		add(b1);
		add(b2);
	}

}