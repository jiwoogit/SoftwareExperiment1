package file;

import java.io.Serializable;

public class PaySet implements Serializable{
	
	private String info;
	public PaySet(String info) {
		// TODO Auto-generated constructor stub
		this.info = info;
	}
	public void print() {
		System.out.println(info);
	}

}
