import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CDemo extends JFrame
{
	public CDemo()
	{
		String Country[]={"INDIA","PAK","SA","AUS","ENG"};
		JButton jb=new JButton("Click");
		ButtonGroup gb=new ButtonGroup();
		JCheckBox jcb=new JCheckBox("yes");
		gb.add(jcb);
		add(jcb);
		jcb=new JCheckBox("no");
		gb.add(jcb);
		add(jcb);
		jcb=new JCheckBox("may be");
		gb.add(jcb);
		add(jcb);
		
		ButtonGroup gb1=new ButtonGroup();
		JRadioButton jrb=new JRadioButton("Click");
		gb1.add(jrb);
		add(jrb);
		
		JComboBox cb=new JComboBox(Country);
		add(cb);
		
		jrb=new JRadioButton("Check");
		gb1.add(jrb);
		add(jrb);
			
		JTextField jtf=new JTextField(15);
		add(jtf);
		
		setSize(500,700);
		setVisible(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new CDemo();
	}
}
		