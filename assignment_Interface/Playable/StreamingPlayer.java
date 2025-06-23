package assignment_Interface.Playable;

public class StreamingPlayer implements Playable {
	public void play(){
		System.out.println("MP3 can play");
	}
	public void pause(){
		System.out.println("MP3 player song is paused");
	}
	public void stop(){
		System.out.println("Stop the music from the MP3");
	}
}