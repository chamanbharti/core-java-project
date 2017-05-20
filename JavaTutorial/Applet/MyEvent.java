import java.awt.event.*;
import java.awt.;

public class MyEvent extends Frame
{
  public MyEvent()
  {
    super("Window Title:Event Handling");
	Button b1;
	b1=new Button("Click Me");
	//getContentPane().add(b1);
	add(b1);
	Button Listener listen=new Button Listener();
	b1.add Action Listener(listen);
	   set Visible(true);
	   set Size(200,200);
  }
	public static void main(String[] args)
        {

	  MyEvent event=new MyEvent();
	}
};//note the semicolon

class ButtonListener implements ActionListener
{
  public void action performed(ActionEvent evt)
  {
	Button source1=(Button) evt.getSource();
	System.out.println("The Button is Pressed");
  }

}