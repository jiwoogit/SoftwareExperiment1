import java.util.ArrayList;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {
	public static void main(String[] args) {
		StartingFrame StartFrame = new StartingFrame("Screw Bar");
	
		
		StartFrame.setVisible(true);
		
		
		
		Customer Jiwoo = new Customer();
		Bartender Dongwon = new Bartender();
		ArrayList<MenuItem> menulist = new ArrayList<MenuItem>();
		MenuItem Martini = new MenuItem("Martini",390000);
		MenuItem Manhattan = new MenuItem("Manhattan",490000);
		MenuItem Brooklyn = new MenuItem("Brooklyn",590000);
		MenuItem Daiquiri = new MenuItem("Daiquiri",690000);
		MenuItem Margarita = new MenuItem("Margarita",790000);
		MenuItem Sidecar = new MenuItem("Sidecar",890000);
		menulist.add(Martini);
		menulist.add(Manhattan);
		menulist.add(Brooklyn);
		menulist.add(Daiquiri);
		menulist.add(Margarita);
		menulist.add(Sidecar);
		Menu menu = new Menu(menulist);


		MenuItem orderedMenu = Jiwoo.order("Brooklyn", menu, Dongwon);
		Dongwon.orderAccepted(orderedMenu);
		Cocktail orderedCocktail = Dongwon.makeCocktail(orderedMenu);
		Scanner sc = new Scanner(System.in);
		int paidMoney =  sc.nextInt();
		Dongwon.Payment(orderedCocktail, paidMoney);	
	}
}
