import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CardLayoutDemo extends Applet implements ActionListener, MouseListener 
{
	Checkbox dog, cat, rat,sparrow, hen, cock;
  	Panel Animals;
  	CardLayout cardLO;
  	Button Animal, Bird;
  	public void init()
	{
    		Animal = new Button("Animal");
    		Bird = new Button("Bird");
    		add(Animal);
    		add(Bird);
    		cardLO = new CardLayout();
    		Animals = new Panel();
    		Animals.setLayout(cardLO); 
    		dog = new Checkbox("dog", null, true);
    		cat = new Checkbox("cat", null, false);
    		rat = new Checkbox("rat", null, false);
    		sparrow = new Checkbox("sparrow");
    		hen = new Checkbox("hen");
    		cock = new Checkbox("cock");
    		Panel AnimalPan = new Panel();
    		AnimalPan.add(dog);
    		AnimalPan.add(cat);
    		AnimalPan.add(rat);
        	Panel BirdPan = new Panel();
    		BirdPan.add(sparrow);
    		BirdPan.add(hen);
    		BirdPan.add(cock);
   	    	Animals.add(AnimalPan, "Animal");
    		Animals.add(BirdPan, "Bird");
    		add(Animals);
   		Animal.addActionListener(this);
    		Bird.addActionListener(this);
    		addMouseListener(this);
  		}
  	public void mousePressed(MouseEvent me) 
	{
    		cardLO.next(Animals);
  	}
	public void mouseClicked(MouseEvent me) 
	{
  	}
  	public void mouseEntered(MouseEvent me) 
	{
  	}
  	public void mouseExited(MouseEvent me) 
	{
  	}
  	public void mouseReleased(MouseEvent me) 
	{
  	}
  	public void actionPerformed(ActionEvent ae) 
	{
    	if(ae.getSource() == Animal) 
	{
      	cardLO.show(Animals, "Animal");
    	}
    	else 
	{
      	cardLO.show(Animals, "Bird");
    	}
  }
}
