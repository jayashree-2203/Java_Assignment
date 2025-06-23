package assignment_Inheritance.RemoteControl;

public class ProductionRemoteControlCar implements RemoteControlCar{
	private int totaldistance=0;
	
	public void drive(){
		totaldistance+=10;
	}
	
	public int getDistanceTravelled(){
		return totaldistance;
	}
}