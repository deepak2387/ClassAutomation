package oops.abstraction;

public class Demo {
	
	public static void main(String[] args) {
		Sprint3 obj=new Sprint3();
		obj.compose();
		obj.send();
		obj.attachment();
		obj.forward();
		obj.reply();

		Outlook obj2= new Sprint3();
		obj2.compose();
		obj2.send();
		obj2.attachment();
		obj2.forward();
		obj2.reply();
		
	}

}
