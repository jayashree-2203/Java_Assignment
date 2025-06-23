package assignment_Inheritance.RemoteControl;

public class Main {
	public static void main(String[] args){
		ProductionRemoteControlCar prod = new ProductionRemoteControlCar();
		ExperimentalRemoteControlCar exp = new ExperimentalRemoteControlCar();
		prod.drive();
		exp.drive();
		System.out.println("ExperimentalRemoteControlCar distance:"+exp.getDistanceTravelled());
		System.out.println("ProductionRemoteControlCar distance:"+prod.getDistanceTravelled());
	}
}