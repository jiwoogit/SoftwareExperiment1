import java.util.ArrayList;

public class Menu {
	private ArrayList<MenuItem> items;
	
	public Menu(ArrayList<MenuItem> items){
		this.items = items;
	}

	public MenuItem search(String name){
		for(MenuItem each: items){
			if(each.getMenuName().equals(name)){
				return each;
			}
		}
		return null;
	}
}
