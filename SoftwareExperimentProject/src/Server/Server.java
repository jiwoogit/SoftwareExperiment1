package Server;

import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	
	@SuppressWarnings({ "resource" })
	public static void main (String[] args) {
		ServerSocket ss= null;
		int id= 0;
		try{
			ss= new ServerSocket(5000);
		} catch(IOException e) {
			// TODOAuto-generated catch block
			e.printStackTrace();
		}
		while(true) {
			try{
				Socket soc= ss.accept();
				Thread t= new CommThread(soc, id++);
				t.start();
				
			} catch(IOException e) {
				// TODOAuto-generated catch block
				e.printStackTrace();
			}
		}
	}
}