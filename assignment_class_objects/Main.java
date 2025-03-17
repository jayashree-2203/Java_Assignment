package assignment_Class_Objects;
import java.util.*;
class Player {
	  private String name;
	  private String position;
	  private int jerseyNumber;
	  
	  public Player(String name, String position, int jerseyNumber){
	    this.name = name;
	    this.position = position;
	    this.jerseyNumber = jerseyNumber;
	  }
	  public void setName(String name){
	    this.name = name;
	  }
	  public String getName(){
	    return name;
	  }
	  public void setPosition(String position){
	    this.position = position;
	  }
	  public String getPosition(){
	    return position;
	  }
	  public void setJerseyNumber(int jerseyNumber){
	    this.jerseyNumber = jerseyNumber;
	  }
	  public int getJerseyNumber(){
	    return jerseyNumber;
	  }
	  public void playGame(){
	    System.out.println(name+" is playing game");
	  }
	  public void train(){
	    System.out.println(name+" is training");
	  }
}
class Team{
	  private String name;
	  private String city;
	  private String division;
	  List<Player> players;

	  public Team(String name, String city, String division, List<Player> players){
	    this.name = name;
	    this.city = city;
	    this.division = division;
	    this.players = players;
	  }

	  public void setName(String name){
	    this.name = name;
	  }
	  public String getName(){
	    return name;
	  }
	  public void setCity(String city){
	    this.city = city;
	  }
	  public String getCity(){
	    return city;
	  }
	  public void setDivision(String division){
	    this.division = division;
	  }
	  public String getDivision(){
	    return division;
	  }
	  public void setPlayers(List<Player>players){
	    this.players = players;
	  }
	  public List<Player>getPlayers(){
	    return players;
	  }
	  public void playGame(){
	    System.out.println(name+" is playing a game");
	  }
	  public void hireCoach(){
	    System.out.println(this.name+ " hired their coach");
	  }
	}
public class Main {
	public static void main(String[] args) {
	    Player player1 = new Player("ViratKohli", "Batsman", 18);
	    Player player2 = new Player("Dhoni", "Wicket Keeper", 8);
	    Team team1 = new Team("Rcb", "Bengaluru", "south", Arrays.asList(player1, player2));  
	    Team team2 = new Team("CSK", "chennai", "south", Arrays.asList(player1, player2));  
	    team1.hireCoach();
	    team2.hireCoach();
	  }
}
