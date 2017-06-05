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
		ObjectOutputStream dos = null;

		try {
			os = soc.getOutputStream();
			dos = new ObjectOutputStream(os);
			dos.writeObject(paymentInfo);
			dos.close();
			this.soc.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
