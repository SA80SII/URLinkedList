import java.util.Arrays;

public class TestClass {

	public static <E> void main(String[] args) {
		URLinkedList<Integer> list = new URLinkedList<Integer>();

		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
<<<<<<< HEAD
		list.add(4);
		System.out.println(list.get(0));
		list.addFirst(-1);
=======
		list.add(99999);



<<<<<<< HEAD
		list.add(2,4);

=======
>>>>>>> b517ad308a18feb77f971c3e867e38d01e4deb90
		System.out.println(list.size());
	


		System.out.println(list.get(2));
		list.addFirst(0);
>>>>>>> 635ab531faaab8c50ab038e8ec21a609f0dd66ee
		System.out.println(list.get(0));
		System.out.println(Arrays.toString(list.toArray()));
		list.remove(1);
		list.remove(3);
		System.out.println(Arrays.toString(list.toArray()));


			}

}
