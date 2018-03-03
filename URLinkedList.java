import java.util.Collection;

import java.util.Iterator;
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

		URNode<E> first = new URNode<E>(null,null);
		URNode<E> secn;
		URNode<E> thir;
		if (head==null){
			first.setElement(element);
			head=tail=first;
		}
		else if (index<0||index>=size()){
			throw new IndexOutOfBoundsException();
		}
		else if (index==(size()-1)){
			first=tail.prev();
			secn=new URNode<E>(element,first,tail);
			first.setNext(secn);
			tail.setPrev(secn);
		}
		else {
			URLinkedListIterator i = new URLinkedListIterator();
			int counter=0;
			while (i.hasNext()==true && counter<index){
				counter++;
				first.next();
			}
			secn=first.prev();
			thir=new URNode<E>(element, secn, first);
			secn.setNext(thir);
			first.setPrev(thir);
			
			
			
			
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

	URNode<E> curr = head;
	if (index < 0 || index >= size) {
		throw new IndexOutOfBoundsException();
	}
	else {
		int i = 0;
		while(i != index) {
			curr = curr.next();
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
		// TODO Auto-generated method stub
		return null;
	}
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
		final URNode<E> t = tail;
		final URNode<E> newNode = new URNode<E>(e,t,null);
		if (head == null) {
			head = tail = newNode;	
		}
		else {
		tail.setNext(newNode);
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

