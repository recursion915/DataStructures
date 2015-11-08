
public interface Heap<T extends Comparable<T>> {
	
	public void insert(Comparable item);
	public boolean isEmpty();
	public int size();
	public Comparable deleteMin();

}
