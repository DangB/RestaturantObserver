
public interface MenuIterator {

	public boolean hasNext();
	public MenuItem getItem();
	public void next();
	public int getIndex();//Used for deleting and debugging

}
