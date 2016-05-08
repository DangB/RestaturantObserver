
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class HeartHealthyIterator implements MenuIterator{
	
	private int index;
	private ArrayList<MenuItem> menuList;
	
	public HeartHealthyIterator(ArrayList<MenuItem> menuList) {
		index = 0;
		this.menuList = menuList;
	}

	@Override
	public boolean hasNext() {
		while (index < menuList.size() && menuList.get(index).heartHealthy != true) {
			index++;
		}
		return index < menuList.size();
	}

	@Override
	public MenuItem getItem() {
		return menuList.get(index);
	}

	@Override
	public void next() {
		if(!this.hasNext()) {
			throw new NoSuchElementException();
		}
		index++;
	}
	
	public int getIndex() {
		return index;
	}
	
}