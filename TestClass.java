import java.util.Arrays;

public class TestClass {

	public static <E> void main(String[] args) {
		URLinkedList<Integer> list = new URLinkedList<Integer>();

		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list.get(0));
		list.addFirst(-1);
		System.out.println(list.get(0));
		System.out.println(Arrays.toString(list.toArray()));
		list.remove(1);
		list.remove(3);
		System.out.println(Arrays.toString(list.toArray()));


			}

}
