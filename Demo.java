import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Demo extends JFrame
{
	public Demo()
	{
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
		JTextField jtf=new JTextField(15);
		add(jtf);
		
		//jb.setSize(500,700);
		setSize(500,700);
		setVisible(true);
		//jtf.setSize(700,900);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new Demo();
	}
}
		