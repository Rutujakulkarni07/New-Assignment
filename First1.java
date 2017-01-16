import java.awt.*;
import java.awt.event.*;
	class First1
	{
		First1()
		{
			Frame f=new Frame();
			Label lb=new Label("User ID");
			TextField t=new TextField();
			Button b=new Button("click me");
			lb.setBounds(10,50,80,30);
			t.setBounds(30,50,80,30);
			b.setBounds(30,100,80,30);//setting button posision
			
			f.add(lb);
			f.add(t);
			f.add(b);//adding button in to frame
			
			f.setSize(300,300);
				//frame size 300 width and 300 hight
			f.setTitle("RUTUJA");	
			//f.setLayout(null);
				//no layout
			f.setVisible(true);
				//now frame will be visible ,by default not visible
			f.addWindowListener(new WindowAdapter()
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

	
