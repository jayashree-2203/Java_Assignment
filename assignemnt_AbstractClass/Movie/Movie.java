package assignemnt_AbstractClass.Movie;

public abstract class Movie {
	protected String title;
    protected int durationInMinutes;

    public Movie(String title, int durationInMinutes) {
        this.title = title;
        this.durationInMinutes = durationInMinutes;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return durationInMinutes;
    }

    public void getDetails() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + durationInMinutes + " minutes");
    }
    public abstract String getGenre();
    public abstract String getRating();
}
