package assignment_Class_Objects;
class Movie_Details{
	  private String name;
	  private String director;
	  private String theme;

	  private static int totalMovies = 0;

	  public Movie_Details(String name, String director, String theme){
	    this.name = name;
	    this.director = director;
	    this.theme = theme;
	    totalMovies++; 
	  }
	  public void setName(String name){
	    this.name = name;
	  }
	  public String getName(){
	    return name;
	  }
	  public void setDirector(String director){
	    this.director = director;
	  }
	  public String getDirector(){
	    return director;
	  }
	  public void setGenres(String genres){
	    this.theme = theme;
	  }
	  public String getGenres(){
	    return theme;
	  }
	  public int getTotalMovies(){
	    return totalMovies;
	  }
	  public String toString()
	  {
		  return this.name+" "+this.director+" "+this.theme;
	  }
	}
	public class Movie {
	  public static void main(String[] args) {
	    Movie_Details m1 = new Movie_Details("Kaithi", "Loki", "Action");
	    Movie_Details m2 = new Movie_Details("Vikram", "Loki", "Action");
	    System.out.println(m1.toString());
	    System.out.println(m2.toString());
	  }
	}