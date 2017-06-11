import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ClickingExitInMenu implements ActionListener{
	JFrame frame = new JFrame();
	public ClickingExitInMenu(JFrame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent e){
		Bartender.numMartini=0;
		Bartender.numManhattan=0;
		Bartender.numBrooklyn=0;
		Bartender.numDaiquiri=0;
		Bartender.numMargarita=0;
		Bartender.numSidecar=0;
		frame.setVisible(false);
	}
}
