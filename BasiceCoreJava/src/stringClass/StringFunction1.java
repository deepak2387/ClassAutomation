package stringClass;

import java.util.concurrent.SynchronousQueue;

import org.omg.Messaging.SyncScopeHelper;

public class StringFunction1 {

	public static void main(String[] args) {
String name =" deepak";
String name2="Deepak";
String name3="Deepak Wankhede";
String name4="Deepak$Wankhede$Alandi";
String name5="DeepakErrorWankhedeErrorAlandi";
//Character count

//int count =name3.length()-name3.replace("e","").length();
System.out.println(name3.length()-name3.replace("e","").length());
//Split
String[] str =name5.split("Er.*?");
for (String s:str){
	System.out.println(s);
	
}

name5.split("Error");

//replace
System.out.println(name5.replace("Error", " replacement "));
System.out.println(name4.replace("$","  "));
System.out.println(name.replace('d','g'));

//substring

System.out.println(name3.substring(6));
System.out.println(name3.substring(0, 6));
//case sensetive
System.out.println(name.equals(name2));
//ignore cases
System.out.println(name.equalsIgnoreCase(name2));
System.out.println(name.length());
//trim
System.out.println(name.trim());
System.out.println(name);
//length
int l=name.length();
System.out.println(l);

//charAT
char c= name.charAt(0);
System.out.println(c);
	}

}
