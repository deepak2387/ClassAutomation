package collection;

import java.awt.List;

public class ListInterface {

	public static void main(String[] args) {
		List list = new List();
		list.add("Deepak");
		list.add("Wankhede");
		list.add("pune");
	
		
		for(String s:list){
			System.out.println(s);
		}

	}

}
//arraylist

/*public class ListInterface {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Deepak");
		list.add("Wankhede");
		list.add("pune");
		
		for(String s:list){
			System.out.println(s);
		}

	}
	//linkedlist
	public class ListInterface {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Deepak");
		list.add("Wankhede");
		list.add("pune");
		
		for(String s:list){
			System.out.println(s);
		}

	}
	//vectors
	public class ListInterface {

	public static void main(String[] args) {
		Vector<String> list = new Vector<>();
		list.add("Deepak");
		list.add("Wankhede");
		list.add("pune");
		
		for(String s:list){
			System.out.println(s);
		}

	}

}
	*
	*
	*
	*/