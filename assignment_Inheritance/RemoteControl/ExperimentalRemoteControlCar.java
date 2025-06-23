package assignment_Inheritance.RemoteControl;

public class ExperimentalRemoteControlCar implements RemoteControlCar{
	private int totaldistance=0;
	
	public void drive(){
		totaldistance+=20;
	}
	
	public int getDistanceTravelled(){
		return totaldistance;
	}
}