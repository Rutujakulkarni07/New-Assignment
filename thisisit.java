import java.awt.*;
import java.applet.*;
import java.util.*;
public class thisisit extends Applet 
{
	public void init() 
	{
    		setLayout(new BorderLayout());
		add(new Button("Master"),BorderLayout.CENTER);
   	 	add(new Button("MCM"),
        	BorderLayout.NORTH);
    		add(new Label("YOGINI"),
        	BorderLayout.SOUTH);
    		add(new Button("RUTUJA"), BorderLayout.EAST);
    		add(new Button("CHETAN"), BorderLayout.WEST);
    		String msg = "The reasonable man adapts" +
      		"himself to the world;\n" +
      		"the unreasonable one persists in " +
      		"trying to adapt the world to himself.\n" +
      		"Therefore all progress depends " +
      		"on the unreasonable man.\n\n" +
      		"-    George Bernard Shaw\n\n";
    	//	add(new Button("hello"), BorderLayout.CENTER);
  	}
}

