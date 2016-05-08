
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class PriceIterator implements MenuIterator{
	
	private int index;
	private ArrayList<MenuItem> menuList;
	private double price;
	
	@SuppressWarnings("unchecked")
	public PriceIterator(ArrayList<MenuItem> menuList, double price) {
		index = 0;
		this.price = price;
		menuList = (ArrayList<MenuItem>) menuList.clone();
	}

	@Override
	public boolean hasNext() {
		while (index < menuList.size() && (menuList.get(index).category != 2 || menuList.get(index).price > price)) {
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