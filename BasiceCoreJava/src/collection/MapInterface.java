package collection;

import java.util.HashMap;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {

		
		HashMap<String,Integer> map =new HashMap<String,Integer>();
		map.put("Deepak",10234);
		map.put("Anand", 124536);
		map.put("vishal", 457696);
		map.put("Deepak",102341);
		Set<String> set =map.keySet();
		for(String Key:set)
		{
			System.out.println(map.get(Key));
		}
		
		//System.out.println(map.get(null));
		
		
	}

}


/*public static void main(String[] args) {


HashMap<String,Integer> map =new HashMap<String,Integer>();
map.put("Deepak",10234);
map.put("Anand", 124536);
map.put("vishal", 457696);
map.put(null, 46712);

System.out.println(map.get(null));

Hashtable<String,String> map2=new  Hashtable<String,String>();
map2.put("class", "java");
map2.put("name", "techbodhi");
map2.put("null,"vksks");
System.out.println(map2.get(null));

}
*/