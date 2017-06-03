import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class SelectingMartiniQuantity implements ActionListener{
		MenuItem Martini= new MenuItem("Martini",390000);
	public SelectingMartiniQuantity(){
		MenuItem Martini = new MenuItem("Martini",390000);
	}
	
	public void actionPerformed(ActionEvent e){
		JFrame order = new JFrame("Order");
		JPanel panel = new JPanel();
		JPanel exitpanel = new JPanel();
		JButton exit = new JButton("Exit");
		JLabel menu_label = new JLabel();
		JSpinner menu_sp = new JSpinner();
		
		SpinnerNumberModel numModel = new SpinnerNumberModel(0,0,100,1);
		menu_sp.setModel(numModel);
		menu_label.setText(Martini.getMenuName());
		
		panel.setLayout(new GridLayout(1,2));
		panel.add(menu_label);
		panel.add(menu_sp);
		
		exitpanel.setLayout(new FlowLayout());
		exitpanel.add(exit);
		
		order.add(panel,BorderLayout.CENTER);
		order.add(exitpanel,BorderLayout.SOUTH);
		order.setBounds(200,200,300,120);
		order.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		order.setVisible(true);
		
		ActionListener clickedExit = new ClickingExit();
		exit.addActionListener(clickedExit);
		
		int value = (int)menu_sp.getValue();
		System.out.println(value);
		
		
	}
}
