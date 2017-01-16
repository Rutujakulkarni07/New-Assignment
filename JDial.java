import javax.swing.*;
import java.awt.*;
class JDial extends JFrame
{
	JDialog d1;
	public JDial()
    	{
        	createAndShowGUI();
    	}
	private void createAndShowGUI()
    	{
        	setTitle("JDialog Example");
        	setDefaultCloseOperation(EXIT_ON_CLOSE);
        	setLayout(new FlowLayout());
		JDialog.setDefaultLookAndFeelDecorated(true);
        	d1=new JDialog(this,"This is title",true);
		d1.setSize(400,400);
        	d1.setLayout(new FlowLayout());
        	d1.add(new JButton("Button"));
        	d1.add(new JLabel("Label"));
        	d1.add(new JTextField(20));
	        setSize(400,400);
        	setVisible(true);
		d1.setVisible(true);
    	}
	public static void main(String args[])
    	{
        	new JDial();
    	}
}
