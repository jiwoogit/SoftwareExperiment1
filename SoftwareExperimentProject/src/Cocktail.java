
public class Cocktail{
	private final String name;
	private final int price;
	
	public Cocktail(MenuItem menuItem){
		this.name = menuItem.getMenuName();
		this.price = menuItem.menuCost();
	}
	
	public int getPrice() {
		return price;
	}	
}