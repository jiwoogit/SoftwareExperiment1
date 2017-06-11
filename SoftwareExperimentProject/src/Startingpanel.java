import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Startingpanel extends JPanel{

		Image image;
		JButton orderTab = new LargeButton("Click Here to Order!!");
		JButton social = new LargeButton("Leave Comments!!");
		Font f;
	


	   public Startingpanel(){
		f = new Font("µ¸À½",Font.BOLD,18);
		orderTab.setFont(f);
		social.setFont(f);
	    image = new ImageIcon("./resource/cocktail.jpg").getImage();
	    add(orderTab);
	    add(social);
	    orderTab.setBackground(Color.white);
	    social.setBackground(Color.white);
	
	    orderTab.setOpaque(false);
	    social.setOpaque(false);
	    ActionListener clickedOrderTab = new ActionEventHandler();
		orderTab.addActionListener(clickedOrderTab);
		//ActionListener clickedSocial = new ActionEventHandler();
		//orderTab.addActionListener(clickedSocial);
	    
	  }

	  public void paint(Graphics g){
	   g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	   setOpaque(false);
	   super.paint(g);   
	   }

}
