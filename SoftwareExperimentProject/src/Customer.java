

public class Customer{
	public MenuItem order(String menuName, Menu menu, Bartender bartender){
		MenuItem menuItem = menu.choose(menuName);
		return menuItem;
		
	}

}

