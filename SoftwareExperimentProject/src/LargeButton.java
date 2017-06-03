import java.awt.Dimension;
import javax.swing.JButton;

public class LargeButton extends JButton{

	public LargeButton(String str) {
		super(str);
	}
	
	public Dimension getPreferredSize(){
		Dimension largeBtmSz = new Dimension(
				super.getPreferredSize().width+30,
				super.getPreferredSize().height+100
				);
		return largeBtmSz;
	}

}
