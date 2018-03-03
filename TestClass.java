
public class TestClass {

	public static <E> void main(String[] args) {
		URLinkedList<Integer> list = new URLinkedList<Integer>();
		list.add(0,4);
		System.out.println(list.get(0));
		list.addFirst(0);
		System.out.println(list.get(0));
			}

}
