package assignments;

public class MyTest14 {

	public static void main(String[] args) {
		Student Megha = new Student();
		//Megha.id=1;
		Megha.setId(1);;
		//Megha.name= "megha";
		Megha.setName("Megha");
		//Megha.age=30;
		Megha.setAge(30);
		//System.out.println(Megha.name + "is" + Megha.age + "years old");
System.out.println(Megha.getName() + " is " + Megha.getAge() + " years old");
	}

}
