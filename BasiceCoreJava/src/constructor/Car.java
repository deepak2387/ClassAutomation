package constructor;

public class Car 
{
String name;
int speed;
String manufacturor;
static int wheels=4;

public Car(String name, int speed, String manufacturor) //Default constructor
{
this.name=name;
this.speed=speed;
this.manufacturor=manufacturor;
}

public Car()
{
	
}

public void drive()
{
System.out.println("Drive "+manufacturor+" "+name+" car at the speed of "+speed);	
}
public void accelarator()
{
System.out.println("Accelarate "+manufacturor+" "+name+" car with "+wheels+" wheels");	
}

}

