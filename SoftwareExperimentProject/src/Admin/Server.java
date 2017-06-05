package Admin;

import java.awt.Paint;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import file.PaySet;

public class Server {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ServerSocket ss = null;
		int id = 0;
		PaySet paymentInfo = new PaySet(null);
		try {
			ss= new ServerSocket(5000);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		InputStream is = null;
		while(true) {
			Socket soc;
			try {
				soc = ss.accept();
				is = soc.getInputStream();
				ObjectInputStream ois = new ObjectInputStream(is);
				paymentInfo = (PaySet) ois.readObject();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			paymentInfo.print();

		}
		
	}

}
