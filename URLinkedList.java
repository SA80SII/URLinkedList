import java.util.Collection;
import java.util.Iterator;

public class URLinkedList<E> implements URList{

	@Override
	public boolean add(Object e) {
		//I am making a change
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public URList subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	// Inserts the specified element at the beginning of this list.
	public void addFirst(E e) {
		
	}
	// Appends the specified element to the end of this list.
	public void addLast(E e) {
		
	}
	// Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
	public  E  peekFirst() {
		return null;
		
	}
	// Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
	public E peekLast() {
		return null;
		
	}
	// Retrieves and removes the first element of this list, or returns null if this list is empty.
	public E pollFirst() {
		return null;
		
	}
	// Retrieves and removes the last element of this list, or returns null if this list is empty.
	public E pollLast() {
		return null;
		
	}

}