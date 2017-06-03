
public class Bartender{
	static int totalCostofAllDrinks=0;
	static int numMartini=0;
	static int numManhattan=0;
	static int numBrooklyn=0;
	static int numDaiquiri=0;
	static int numMargarita=0;
	static int numSidecar=0;
	public Cocktail makeCocktail(MenuItem menuItem){
		Cocktail cocktail = new Cocktail(menuItem);
		return cocktail;
	}
	public int Payment(Cocktail cocktail, int money){
		if( money==cocktail.getPrice() ){
			System.out.println("Thank you!! Enjoy yourself!!");
			return 0;
		}
		else if( money>cocktail.getPrice() ){
			System.out.println("Here is your change. Thank you!! Enjoy yourself!!");
			return money-cocktail.getPrice();	
		}
		else{
			System.out.println("µ· ´õ³»³ö");
			return 0;
		}
	}

	public MenuItem orderAccepted(MenuItem orderedMenu){
		return orderedMenu;
	}

	
	
}