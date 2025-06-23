package assignment_Interface.Playable;

public class MP3Player implements Playable {
	public void play(){
		System.out.println("MP3 - played");
	}
	public void pause(){
		System.out.println("MP3 - paused");
	}
	public void stop(){
		System.out.println("MP3 - stopped");
	}
}