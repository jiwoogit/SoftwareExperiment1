package Server;

import java.io.IOException;

import java.io.ObjectOutputStream;
import java.net.Socket;

import file.File;

public class CommThread extends Thread {
	private Socket soc;
	private int id;
	public CommThread(Socket soc, int id) {
		this.soc= soc;
		this.id= id;
	}
	File infor = new File(50);
	public void run () {
		try{
			java.io.OutputStream os= soc.getOutputStream();
			ObjectOutputStream dos= new ObjectOutputStream(os);
			dos.writeObject(w);
			w.printAll();
			
			dos.close();
			this.soc.close();
		} catch(IOException e) {
			// TODOAuto-generated catch block
			e.printStackTrace();
		}
	}
}