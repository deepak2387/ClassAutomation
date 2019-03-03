package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface2 {

	public static void main(String[] args) {
	
		Set<String> set =new LinkedHashSet<>();
		set.add("Deep");
		set.add("wankhede");
		set.add("pune");
		set.add("class");
		set.add("Deep");
for(String s:set){
		System.out.println(s);
	}
	}
}




/*
 * 	public static void main(String[] args) {
	
		Set<String> set =new TreeSet<>();
		set.add("Deep");
		set.add("wankhede");
		set.add("pune");
		set.add("class");
		set.add("Deep");
for(String s:set){
		System.out.println(s);
	}
	}
}
 */

/*
public static void main(String[] args) {

HashSet<String> set =new HashSet<>();
set.add("Deep");
set.add("wankhede");
set.add("pune");
set.add("class");
set.add("Deep");
for(String s:set){
System.out.println(s);
}
}
}
*/