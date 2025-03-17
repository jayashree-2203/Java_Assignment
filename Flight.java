package assignment_Class_Objects;
class Flight_Details{
	  private int id;
	  private String name;
	  private int noOfSeats;
	  private static int ids;

	  public Flight_Details(String name, int noOfSeats){
	    this.name = name;
	    this.noOfSeats = noOfSeats;
	    ids++;
	    this.id = ids;
	  }
	  public void setId(int id){
	    this.id = id;
	  }
	  public int getId(){
	    return id;
	  }
	  public void setName(String name){
	    this.name = name;
	  }
	  public String getName(){
	    return name;
	  }
	  public void setNoOfSeats(int noOfSeats){
	    this.noOfSeats = noOfSeats;
	  }
	  public int getNoOfSeats(){
	    return noOfSeats;
	  }
	  public int getTotalFlights(){
	    return ids;
	  }
	  public String toString()
	  {
		  return this.id+" "+this.name+" "+this.noOfSeats;
	  }
	}
	public class Flight {
	  public static void main(String[] args) {
	    Flight_Details f1 = new Flight_Details("ATR",60);
	    Flight_Details f2 = new Flight_Details("AirBus", 120);
	    System.out.println(f1.toString()); 
	    System.out.println(f2.toString()); 
	  }
	}