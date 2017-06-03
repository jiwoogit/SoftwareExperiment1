import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class StartingFrame extends JFrame{
	Container content;
	Image imgP;

	 public StartingFrame(String title){
	   super(title);
	   Startingpanel startingpanel = new Startingpanel();
	   content = getContentPane();     
	   content.add(startingpanel, BorderLayout.CENTER);
	   setBounds(600,120,600,600);
		
	   setVisible(true);
	 }


}
