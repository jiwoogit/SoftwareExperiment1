import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ActionEventHandler implements ActionListener{
	public void actionPerformed(ActionEvent e){
		JFrame showMenuFrame = new JFrame("Here is the Menu!!!");
		showMenuFrame.setBounds(600,120,600,600);
		showMenuFrame.setLayout(new BorderLayout());
		
		JButton martini = new JButton("Martini");
		JButton manhattan = new JButton("Manhattan");
		JButton brooklyn = new JButton("Brooklyn");
		JButton daiquiri = new JButton("Daiquiri");
		JButton margarita = new JButton("Margarita");
		JButton sidecar = new JButton("Sidecar");
		JButton exit = new JButton("Exit");
		JButton orderMenu = new JButton("Order Cocktails");

		JPanel menuPanel = new JPanel();
		menuPanel.setLayout(new GridLayout(3,2,2,2));
		menuPanel.add(martini);
		menuPanel.add(manhattan);
		menuPanel.add(brooklyn);
		menuPanel.add(daiquiri);
		menuPanel.add(margarita);
		menuPanel.add(sidecar);
		
		JPanel exitandOrderPanel = new JPanel();
		exitandOrderPanel.setLayout(new FlowLayout());
		exitandOrderPanel.add(exit);
		exitandOrderPanel.add(orderMenu);

		
		showMenuFrame.add(menuPanel, BorderLayout.CENTER);
		showMenuFrame.add(exitandOrderPanel, BorderLayout.SOUTH);
		showMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener selectMartiniQuantity = new SelectingMartiniQuantity();
		martini.addActionListener(selectMartiniQuantity);
		ActionListener selectManhattanQuantity = new SelectingManhattanQuantity();
		manhattan.addActionListener(selectManhattanQuantity);
		ActionListener selectBrooklynQuantity = new SelectingBrooklynQuantity();
		brooklyn.addActionListener(selectBrooklynQuantity);
		ActionListener selectDaiquiriQuantity = new SelectingDaiquiriQuantity();
		daiquiri.addActionListener(selectDaiquiriQuantity);
		ActionListener selectMargaritaQuantity = new SelectingMargaritaQuantity();
		margarita.addActionListener(selectMargaritaQuantity);
		ActionListener selectSidecarQuantity = new SelectingSidecarQuantity();
		sidecar.addActionListener(selectSidecarQuantity);
		exit.addActionListener(new ClickingExitInMenu(showMenuFrame));
		orderMenu.addActionListener(new CheckingPayment());
		
		showMenuFrame.setVisible(true);
	}

}
