import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import file.PaySet;

public class CommThread extends Thread{

	private Socket soc;
	private int id;
	PaySet paymentInfo = null;
	public CommThread(Socket soc, int id, PaySet paymentInfo) {
		this.soc = soc;
		this.id = id;
		this.paymentInfo = paymentInfo;
	}
	
	public void run() {
		OutputStream os = null;
		try {
			os = soc.getOutputStream();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		ObjectOutputStream dos = null;
		try {
			dos = new ObjectOutputStream(os);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			dos.writeObject(paymentInfo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			dos.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			this.soc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
