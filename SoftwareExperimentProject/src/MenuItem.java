
public class MenuItem {
	private String menuName;
	private int menuPrice;
	
	public MenuItem(String name, int price){
		this.menuName = name;
		this.menuPrice = price;
	}
	
	public int menuCost(){
		return menuPrice;
	}
	
	public String getMenuName(){
		return this.menuName;
	}
}
