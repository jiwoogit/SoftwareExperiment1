import java.util.ArrayList;

public class Menu {
	private ArrayList<MenuItem> items;
	
	public Menu(ArrayList<MenuItem> items){
		this.items = items;
	}

	public MenuItem search(String name){
		for(MenuItem one : items){
			if(one.getMenuName().equals(name));{
				return one;
			}
		}
		return null;
	}
}
