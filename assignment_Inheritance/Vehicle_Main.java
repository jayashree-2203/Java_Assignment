package assignment_Inheritance;

class Vehicle
{
	String brand;
	int speed;
	Vehicle(String brand,int speed)
	{
		this.brand=brand;
		this.speed=speed;
	}
}
class Bike extends Vehicle
{
	Bike(String brand,int speed,String fuel)
	{
		super(brand,speed);
	}
	public void time_Taken(int dist)
	{
		System.out.println("Time taken by "+brand+" bike is "+(double)((dist*100)/speed));
	}
}
class Car extends Vehicle
{
	int seater;
	Car(String brand,int speed,String fuel,int seater)
	{
		super(brand,speed);
		this.seater=seater;
	}
	public void time_Taken(int dist)
	{
		System.out.println("Time taken by "+brand+" car is "+(double)((dist*100)/speed));
	}
}
public class Vehicle_Main {

	public static void main(String[] args) {
		Bike bike_obj1=new Bike("Hero",55,"Petrol");
		Bike bike_obj2=new Bike("Honda",60,"Petrol");
		bike_obj1.time_Taken(10);
		bike_obj2.time_Taken(10);
		Car car_obj1=new Car("Toyoto",80,"Deisel",4);
		Car car_obj2=new Car("Tata",90,"Deisel",8);
		bike_obj2.time_Taken(140);
		bike_obj2.time_Taken(80);
	}
}
