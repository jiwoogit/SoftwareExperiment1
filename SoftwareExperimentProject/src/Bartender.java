import java.util.ArrayList;

public class Bartender{
	static int numMartini=0;
	static int numManhattan=0;
	static int numBrooklyn=0;
	static int numDaiquiri=0;
	static int numMargarita=0;
	static int numSidecar=0;
	ArrayList<MenuItem> menulist = new ArrayList<MenuItem>();
	MenuItem Martini = new MenuItem("Martini",390000);
	MenuItem Manhattan = new MenuItem("Manhattan",490000);
	MenuItem Brooklyn = new MenuItem("Brooklyn",590000);
	MenuItem Daiquiri = new MenuItem("Daiquiri",690000);
	MenuItem Margarita = new MenuItem("Margarita",790000);
	MenuItem Sidecar = new MenuItem("Sidecar",890000);
	Menu menu = new Menu(menulist);
	public Bartender(){
		menulist.add(Martini);
		menulist.add(Manhattan);
		menulist.add(Brooklyn);
		menulist.add(Daiquiri);
		menulist.add(Margarita);
		menulist.add(Sidecar);
	}


	public ArrayList<String> checkOrderedList(){
		ArrayList<String> checklist = new ArrayList<String>();
		if(Bartender.numMartini!=0){
			Integer num = Bartender.numMartini; 
			checklist.add(num.toString() +" Marini(s)");
		}
		if(Bartender.numManhattan!=0){
			Integer num = Bartender.numManhattan; 
			checklist.add(num.toString() +" Manhattan(s)");
		}
		if(Bartender.numBrooklyn!=0){
			Integer num = Bartender.numBrooklyn; 
			checklist.add(num.toString() +" Brooklyn(s)");
		}
		if(Bartender.numDaiquiri!=0){
			Integer num = Bartender.numDaiquiri; 
			checklist.add(num.toString() +" Daiquiri(s)");
		}
		if(Bartender.numMargarita!=0){
			Integer num = Bartender.numMargarita; 
			checklist.add(num.toString() +" Margarita(s)");
		}
		if(Bartender.numSidecar!=0){
			Integer num = Bartender.numSidecar; 
			checklist.add(num.toString() +" Sidecar(s)");
		}
		
		return checklist;
	}
	
	public String CalculateTotalAmountOfMoney(){
		Integer sum=0;
		sum = sum + Bartender.numMartini * (menu.search("Martini").menuCost() );
		sum = sum + Bartender.numManhattan * (menu.search("Manhattan").menuCost() );
		sum = sum + Bartender.numBrooklyn * (menu.search("Brooklyn").menuCost() );
		sum = sum + Bartender.numDaiquiri * (menu.search("Daiquiri").menuCost() );
		sum = sum + Bartender.numMargarita * (menu.search("Margarita").menuCost() );
		sum = sum + Bartender.numSidecar * (menu.search("Sidecar").menuCost() );
		return sum.toString();
	}



	
}