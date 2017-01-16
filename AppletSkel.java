import java.awt.*;
import java.applet.*;
public class AppletSkel extends Applet
{
String msg;
	public void init()
	{
		setBackground(Color.green);
		setForeground(Color.red);
		msg="My name is Rutuja";
	}
	public void start()
	{
		msg += " inside start";
	}
	public void stop()
	{
	}
	public void destroy()
	{
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,10,20);			
	}
}