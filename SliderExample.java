import javax.swing.*;  
public class SliderExample extends JFrame
{  
	public SliderExample() 
	{  
		JSlider s = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);  
		s.setMinorTickSpacing(2);  
		s.setMajorTickSpacing(10); 
		s.setPaintTicks(true);  
		s.setPaintLabels(true);  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		JPanel jp=new JPanel();  
		jp.add(s);  
		add(jp);  
	} 
	public static void main(String s[]) 
	{
		SliderExample frame=new SliderExample();  
		frame.pack();  
		frame.setVisible(true);  
	}
}  
