import java.util.Collection;

import java.util.Iterator;
import java.util.NoSuchElementException;
public class URLinkedList<E> implements URList<E>{
	 transient URNode<E> head;
	 transient URNode<E> tail;
	 transient int size = 0;
	 
	 
	@Override
	public boolean add(E e) {
		addLast(e);
		return true;	
	}

	@Override
	public void add(int index, E element) {

		URNode<E> first = head;
		URNode<E> secn;
		URNode<E> thir;
		if (head==null){
			head.setElement(element);
			tail.setElement(element);
		}
		else if (index==(size()-1)){
			first=tail.prev();
			secn.setPrev(first);
			secn.setElement(element);
			first = secn.prev();
			tail = secn.next();
			secn = tail.prev();
		}
		else {
			URLinkedListIterator i = new URLinkedListIterator();
			int counter=0;
			while (i.hasNext()==true && counter<index){
				counter++;
				first.next();
			}
			secn=first.prev();
			thir.prev()=secn;
			
			
			
		first.setElement(element);
		}

		
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
	public E get(int index) {
	if(head== null) {
		throw new NoSuchElementException();
	}
	URNode<E> curr = head;
	if (index < 0 || index >= size) {
		throw new IndexOutOfBoundsException();
	}
	else {
		int i = 0;
		while(i != index) {
			curr = curr.next();
			i++;
		}
		return curr.element();		
	}
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
		return new URLinkedListIterator();
	}
	
	private class URLinkedListIterator implements Iterator<E> {
		URNode<E> curr;
		public URLinkedListIterator() {
			curr = head;
		}

		@Override
		public boolean hasNext() {
			if(curr.next() != null){
				return true;
			}
		return false;
		}

		@Override
		public E next() {
			if(hasNext()){
				curr = curr.next();
			}
			return curr.element();
		}
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		URNode<E> rem;
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
		return size;
	}

	@Override
	public URList subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		Object [] array = new Object[size];
		URNode<E> f = head;
		for(int i = 0; i< size; i++) {
			array[i] = f.element();
			f = f.next();
		}
		return array;
	}
	// In
	// Inserts the specified element at the beginning of this list.
	public void addFirst(E e) {
		final URNode<E> f = head;
		final URNode<E> newNode = new URNode<E>(e,null,f);
		head = newNode;
		if (head==null) {
			head=tail = newNode;
		}
		else {
			head.setPrev(newNode);
		}
		size++;
		
	}
	// Appends the specified element to the end of this list.
	public void addLast(E e) {
		URNode<E> newNode = new URNode<E>(e,tail,null);
		if (head == null) {
			head = newNode;	
			tail = head;
		}
		else {
		tail.setNext(newNode);
		tail = newNode;
		}
		size++;
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

