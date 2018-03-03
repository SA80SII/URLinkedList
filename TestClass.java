import java.util.Arrays;

public class TestClass {

	public static <E> void main(String[] args) {
		URLinkedList<Integer> list = new URLinkedList<Integer>();

		list.add(5);
		list.add(3);
		list.add(99999);



<<<<<<< HEAD
		list.add(2,4);

=======
>>>>>>> b517ad308a18feb77f971c3e867e38d01e4deb90
		System.out.println(list.size());
	


		System.out.println(list.get(2));
		list.addFirst(0);
		System.out.println(list.get(0));
		System.out.println(Arrays.toString(list.toArray()));

			}

}
