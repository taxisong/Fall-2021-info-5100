package taxisong;

import java.util.ArrayList;
import java.util.List;

public class Genre {
    String name;
    ArrayList<Movie> movies;

    public Genre(String name){
        this.name = name;
        this.movies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public void addMovies(Movie movie){
        this.movies.add(movie);
    }
}//end of Genre
