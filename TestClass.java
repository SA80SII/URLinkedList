import java.util.Arrays;

public class TestClass {

	public static <E> void main(String[] args) {
		URLinkedList<Integer> list = new URLinkedList<Integer>();

		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
<<<<<<< HEAD
		list.add(99999);




		list.add(1,4);


=======
		list.add(4);
		list.add(5);
		System.out.println(list.get(0));
>>>>>>> 02ece94df873107f31e4e777aa360aa11e9ba1a5
		System.out.println(list.size());
	


		System.out.println(list.get(2));
		System.out.println(list.get(5));
		System.out.println(Arrays.toString(list.toArray()));
		list.remove(1);
		System.out.println(Arrays.toString(list.toArray()));
		list.remove(2);
		System.out.println(Arrays.toString(list.toArray()));
		list.remove(0);
		System.out.println(Arrays.toString(list.toArray()));


			}

}
