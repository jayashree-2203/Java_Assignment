package assignment_Interface.Playable;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Playable player=null;
		System.out.println("Enter to Play\n1.Mp3\n2.CD\n3.StreamingPlayer");
		int option=sc.nextInt();
		
			switch(option){
				case 1:
					player=new MP3Player();
					break;
				case 2:
					player=new CDPlayer();
					break;
				case 3:
					player=new StreamingPlayer();
					break;
				default:
					System.out.println("No such player is available");
					System.exit(0);
			}
			player.play();
			player.pause();
			player.stop();
	}
}