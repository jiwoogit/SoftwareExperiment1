import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ActionEventHandler implements ActionListener{
	ImageIcon martiniIcon = new ImageIcon("./resource/martini.jpg");
	Image martiniImg = martiniIcon.getImage();
	Image fitMartiniImg = martiniImg.getScaledInstance(180,170,Image.SCALE_SMOOTH); 
	ImageIcon manhattanIcon = new ImageIcon("./resource/manhattan.jpg");
	Image manhattanImg = manhattanIcon.getImage();
	Image fitManhattanImg = manhattanImg.getScaledInstance(180,170,Image.SCALE_SMOOTH); 
	ImageIcon brooklynIcon = new ImageIcon("./resource/brooklyn.jpg");
	Image brooklynImg = brooklynIcon.getImage();
	Image fitBrooklynImg = brooklynImg.getScaledInstance(180,170,Image.SCALE_SMOOTH); 
	ImageIcon daiquiriIcon = new ImageIcon("./resource/daiquiri.jpg");
	Image daiquiriImg = daiquiriIcon.getImage();
	Image fitDaiquiriImg = daiquiriImg.getScaledInstance(180,170,Image.SCALE_SMOOTH); 
	ImageIcon margaritaIcon = new ImageIcon("./resource/margarita.jpg");
	Image margaritaImg = margaritaIcon.getImage();
	Image fitMargaritaImg = margaritaImg.getScaledInstance(180,170,Image.SCALE_SMOOTH); 
	ImageIcon sidecarIcon = new ImageIcon("./resource/sidecar.jpg");
	Image sidecarImg = sidecarIcon.getImage();
	Image fitSidecarImg = sidecarImg.getScaledInstance(180,170,Image.SCALE_SMOOTH); 
	
	public ActionEventHandler(){
		
	}
	public void actionPerformed(ActionEvent e){
		JFrame showMenuFrame = new JFrame("Here is the Menu!!!");
		showMenuFrame.setBounds(600,120,600,600);
		showMenuFrame.setLayout(new BorderLayout());
		
		JButton martini = new JButton(new ImageIcon(fitMartiniImg));
		JButton manhattan = new JButton(new ImageIcon(fitManhattanImg));
		JButton brooklyn = new JButton(new ImageIcon(fitBrooklynImg));
		JButton daiquiri = new JButton(new ImageIcon(fitDaiquiriImg));
		JButton margarita = new JButton(new ImageIcon(fitMargaritaImg));
		JButton sidecar = new JButton(new ImageIcon(fitSidecarImg));
		JButton exit = new JButton("Exit");
		JButton orderMenu = new JButton("Order Cocktails");
		
		martini.setBackground(new Color(255,255,255));
		manhattan.setBackground(new Color(255,255,255));
		brooklyn.setBackground(new Color(255,255,255));
		daiquiri.setBackground(new Color(255,255,255));
		margarita.setBackground(new Color(255,255,255));
		sidecar.setBackground(new Color(255,255,255));
		
		
		
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
		//showMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
		orderMenu.addActionListener(new CheckingPayment(showMenuFrame));
		orderMenu.addActionListener(new ClosetheMenuFrame(showMenuFrame));
		
		showMenuFrame.setVisible(true);
	}

}
