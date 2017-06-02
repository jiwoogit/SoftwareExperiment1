import java.util.ArrayList;

public class Menu {
	private ArrayList<MenuItem> items;
	
	public Menu(ArrayList<MenuItem> items){
		this.items = items;
	}
	
	public void showMenu(){
		for(MenuItem one : items){
			System.out.println(one.getMenuName()+":"+one.menuCost());
		}
	}
	
	public MenuItem choose(String name){
		for(MenuItem one : items){
			if(one.getMenuName().equals(name));{
				return one;
			}
		}
		return null;
	}
}
