import java.util.Arrays;

public class TestClass {

	public static <E> void main(String[] args) {
		URLinkedList<Integer> list = new URLinkedList<Integer>();
<<<<<<< HEAD

=======
>>>>>>> a0dcf6d99ecd5cac1d19d3af8ae5fdebbe604a48
		list.add(2);
		list.add(3);
		list.add(99999);

<<<<<<< HEAD

		list.add(0,4);

		System.out.println(list.size());
	

=======
>>>>>>> a0dcf6d99ecd5cac1d19d3af8ae5fdebbe604a48
		System.out.println(list.get(0));
		list.addFirst(0);
		System.out.println(list.get(1));
		System.out.println(Arrays.toString(list.toArray()));

			}

}
