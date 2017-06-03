import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.DefaultFormatter;

public class SelectingSidecarQuantity implements ActionListener{
	
	MenuItem Sidecar = new MenuItem("Sidecar",890000);
	public SelectingSidecarQuantity(){
		MenuItem Sidecar = new MenuItem("Sidecar",890000);
	}
	
	public void actionPerformed(ActionEvent e){
		JFrame order = new JFrame("Order");
		JPanel panel = new JPanel();
		JPanel exitpanel = new JPanel();
		JButton exit = new JButton("Exit");
		JLabel menu_label = new JLabel();
		JSpinner menu_sp = new JSpinner();
		JTextField totalCost = new JTextField();
		
		SpinnerNumberModel numModel = new SpinnerNumberModel(0,0,100,1);
		menu_sp.setModel(numModel);
		menu_label.setText(Sidecar.getMenuName());
		totalCost.setText("Total Cost");
		totalCost.setColumns(20);
		
		JComponent comp = menu_sp.getEditor();
		JFormattedTextField field = (JFormattedTextField) comp.getComponent(0);
		DefaultFormatter formatter = (DefaultFormatter) field.getFormatter();
		formatter.setCommitsOnValidEdit(true);
		menu_sp.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				Bartender.numSidecar = (Integer)menu_sp.getValue();
				Integer totalcost =Bartender.numSidecar*Sidecar.menuCost();
				totalCost.setText(totalcost.toString()+"won");
			}
		});
		exit.addActionListener(new ClickingExitInSelectingQuantity(order));
			
		panel.setLayout(new GridLayout(1,2));
		panel.add(menu_label);
		panel.add(menu_sp);
		
		exitpanel.setLayout(new FlowLayout());
		exitpanel.add(totalCost);
		exitpanel.add(exit);
		
		order.add(panel,BorderLayout.CENTER);
		order.add(exitpanel,BorderLayout.SOUTH);
		order.setBounds(700,200,400,120);
		order.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		order.setVisible(true);
	}
	

}