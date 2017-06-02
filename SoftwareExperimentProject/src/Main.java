import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Customer Jiwoo = new Customer();
		Bartender Dongwon = new Bartender();
		ArrayList<MenuItem> menulist = new ArrayList<MenuItem>();
		MenuItem BlueMarmaid = new MenuItem("Blue Marmaid",190000);
		MenuItem Bbyongari = new MenuItem("Bbyongari",290000);
		MenuItem Martini = new MenuItem("Martini",390000);
		MenuItem Manhattan = new MenuItem("Manhattan",490000);
		MenuItem Brooklyn = new MenuItem("Brooklyn",590000);
		MenuItem Daiquiri = new MenuItem("Daiquiri",690000);
		MenuItem Margarita = new MenuItem("Margarita",790000);
		MenuItem Sidecar = new MenuItem("Sidecar",890000);
		menulist.add(BlueMarmaid);
		menulist.add(Bbyongari);
		menulist.add(Martini);
		menulist.add(Manhattan);
		menulist.add(Brooklyn);
		menulist.add(Daiquiri);
		menulist.add(Margarita);
		menulist.add(Sidecar);
		Menu menu = new Menu(menulist);
		
		Dongwon.greeting();
		menu.showMenu();
		MenuItem orderedMenu = Jiwoo.order("Bbyongari", menu, Dongwon);
		Dongwon.orderAccepted(orderedMenu);
		Cocktail orderedCocktail = Dongwon.makeCocktail(orderedMenu);
		Dongwon.askForMoney(orderedCocktail);
		Scanner sc = new Scanner(System.in);
		int paidMoney =  sc.nextInt();
		Dongwon.Payment(orderedCocktail, paidMoney);
	

		
	}
}
