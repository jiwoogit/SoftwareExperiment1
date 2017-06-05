import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import file.PaySet;

public class PayAndSendPaymentList implements ActionListener{
		String string;
	public PayAndSendPaymentList(String string){
		this.string = string;
		
	}
	
	public void actionPerformed(ActionEvent e){
		PaySet paymentInfo = new PaySet(string);
		int id = 0;

		Socket soc = null;
		try {
			soc = new Socket("localhost", 5000);
			ObjectOutputStream oos = new ObjectOutputStream(soc.getOutputStream());
			oos.writeObject(paymentInfo);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Thread t = new CommThread(soc, id++, paymentInfo);
		t.start();
		
		
		
		//oos.close();
		
		try {
			soc.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
