package Admin;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import file.PaySet;

public class Server {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ServerSocket ss = null;
		int customerNo = 1;
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
				ois.close();
				soc.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Customer "+ customerNo+":");
			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream("receipt/Customer "+ customerNo + ".txt");
				fos.write(paymentInfo.returnString().getBytes());
				fos.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			customerNo++;
			paymentInfo.print();


		}
		
	}

}