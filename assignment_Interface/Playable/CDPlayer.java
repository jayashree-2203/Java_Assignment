package assignment_Interface.Playable;

public class CDPlayer implements Playable {
	public void play(){
		System.out.println("CD - played");
	}
	public void pause(){
		System.out.println("CD - paused");
	}
	public void stop(){
		System.out.println("CD - stopped");
	}
}