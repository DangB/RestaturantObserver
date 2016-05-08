
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ItemNumberIterator implements MenuIterator {
    private int index;
    private ArrayList<MenuItem> menuList;
    private int num;
    
    public ItemNumberIterator(ArrayList<MenuItem> menuList, int num) {
        index = 0;
        this.menuList = menuList;
        this.num = num;
    }

    public boolean hasNext() {
    	while (index < menuList.size() && menuList.get(index).itemNumber != num) {
			index++;
		}
		return index < menuList.size();
    }

    public MenuItem getItem() {
        return menuList.get(index);
    }

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
