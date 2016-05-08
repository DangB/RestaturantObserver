
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class AllItemsIterator implements MenuIterator{
	
	private int index;
	private ArrayList<MenuItem> menuList;
	
	@SuppressWarnings("unchecked")
	public AllItemsIterator(ArrayList<MenuItem> menuList) {
		index = 0;
		this.menuList = menuList;
	}
        
        @SuppressWarnings("unchecked")
	public AllItemsIterator(ArrayList<MenuItem> menuList, int index) {
		this.index = index;
		this.menuList = menuList;
	}
	

	@Override
	public boolean hasNext() {
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
