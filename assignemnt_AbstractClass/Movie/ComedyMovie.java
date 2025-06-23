package assignemnt_AbstractClass.Movie;

public class ComedyMovie extends Movie {
    public ComedyMovie(String title, int durationInMinutes) {
        super(title, durationInMinutes);
    }

    @Override
    public String getGenre() {
        return "Comedy";
    }

    @Override
    public String getRating() {
        return "IBMP-8.3";
    }
}