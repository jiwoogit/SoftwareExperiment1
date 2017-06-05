import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckingPayment implements ActionListener{
	Bartender bartender = new Bartender();

	public void actionPerformed(ActionEvent e){
		JFrame checkingPaymentFrame = new JFrame("Pay");
		checkingPaymentFrame.setBounds(800,320,750,300);
		checkingPaymentFrame.setLayout(new BorderLayout());
		
		JButton back = new JButton("back");
		JButton pay = new JButton("pay");
		JTextField paymentContent = new JTextField();
		
		checkingPaymentFrame.add(paymentContent, BorderLayout.SOUTH);
		checkingPaymentFrame.add(back, BorderLayout.NORTH);
		checkingPaymentFrame.add(pay, BorderLayout.CENTER);
		checkingPaymentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String string = "You ordered ";
		Iterator<String> iterator = bartender.checkOrderedList().iterator();
		while(iterator.hasNext()){
			string = string + iterator.next()+" ";
		}
		String totalMoney =  bartender.CalculateTotalAmountOfMoney() ;
		string = string + "# Total:"+ totalMoney + "won";
		paymentContent.setText(string);
		back.addActionListener(new ClickingExitInMenu(checkingPaymentFrame));
	//	pay.addActionListener(new Payment());
		
		checkingPaymentFrame.setVisible(true);
	}

}
