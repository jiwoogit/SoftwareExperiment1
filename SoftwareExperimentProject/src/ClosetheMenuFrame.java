import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ClosetheMenuFrame implements ActionListener{
	JFrame frame = new JFrame();
	public ClosetheMenuFrame(JFrame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent e){
	
		frame.setVisible(false);
	}
}
