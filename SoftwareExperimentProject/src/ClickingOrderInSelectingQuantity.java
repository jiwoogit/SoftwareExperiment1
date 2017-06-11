import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JSpinner;

public class ClickingOrderInSelectingQuantity implements ActionListener{
	JFrame frame = new JFrame();
	public ClickingOrderInSelectingQuantity(JFrame frame){
		this.frame = frame;
	}
	public void actionPerformed(ActionEvent e){
		frame.setVisible(false);

	}

}
