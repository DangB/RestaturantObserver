

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ItemIterator implements MenuIterator{
	
	private int index;
	private ArrayList<MenuItem> menuList;
	private int category;
	
	@SuppressWarnings("unchecked")
	public ItemIterator(ArrayList<MenuItem> menuList, int itemType) {
		index = 0;
		menuList = (ArrayList<MenuItem>) menuList.clone();
		category = itemType;
	}

	@Override
	public boolean hasNext() {
		while (index < menuList.size() && menuList.get(index).category != category) {
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