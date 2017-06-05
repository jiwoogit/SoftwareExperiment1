import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Startingpanel extends JPanel{

		Image image;
		JButton orderTab = new LargeButton("Click Here to Order");


	   public Startingpanel(){
	    image = new ImageIcon("./resource/cocktail.jpg").getImage();
	    add(orderTab);
	    orderTab.setBackground(Color.white);
	
	    orderTab.setOpaque(false);
	    ActionListener clickedOrderTab = new ActionEventHandler();
		orderTab.addActionListener(clickedOrderTab);
	    
	  }

	  public void paint(Graphics g){
	   g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	   setOpaque(false);
	   super.paint(g);   
	   }

}
