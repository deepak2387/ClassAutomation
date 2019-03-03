package collection;
import java.util.*;

public class SetInterface {

	public static void main(String[] args) {
	//tree set gives the sorted vaule
		TreeSet<Integer> set = new TreeSet<>();
		
set.add(20);
set.add(30);
set.add(40);
set.add(30);
for(int a:set){
	System.out.println(a);
}
	}

}
/*
 * 
 * public class SetInterface {

	public static void main(String[] args) {
	//linked hashset maintaines the order
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
set.add(20);
set.add(20);
set.add(20);
set.add(30);
for(int a:set){
	System.out.println(a);
}
	}

}
public class SetInterface {

public static void main(String[] args) {
//hashset
	HashSet<Integer> set = new HashSet<>();
	
set.add(20);
set.add(20);
set.add(20);
set.add(30);
for(int a:set){
System.out.println(a);
}
}

}*/
