import java.awt.*;
import java.awt.event.*;
	class First extends Frame
	{
		First()
		{
			Button b=new Button("click me");
			b.setBounds(30,100,80,30);//setting button posision
			add(b);//adding button in to frame
			setSize(300,300);
				//frame size 300 width and 300 hight
			setLayout(null);
				//no layout
			setVisible(true);
				//now frame will be visible ,by default not visible
			addWindowListener(new WindowAdapter()
			{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			});
		}
	public static void main(String args[])
	{
	First f=new First();
	}
}

	
