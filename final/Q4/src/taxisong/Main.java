package taxisong;

import com.sun.net.httpserver.Filter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Netflix netflix = new Netflix("Netflix");

        //For all movies released before 2000,
        // add the string "(Classic)" to the title of the movie using flatMap.
        netflix.genres.stream().flatMap(genre -> genre.getMovies().stream())
                .filter(movie -> movie.releaseDate.before(2000))
                .forEach(movie -> movie.title = movie.title + "(Classic)");

        //Get the latest 3 movies released using .limit() method of stream.
        netflix.genres.stream().limit(3).flatMap(genre -> genre.getMovies().stream())
                .reduce((movie, movie2) -> movie.releaseDate.after(movie2) ? movie : movie2);

        //Sorting on one of the feature(Ex: Released year or title)
        // which will use comparator.
        ArrayList<Movie> movies = new ArrayList<>();
        //list.add();
        movies.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie movie1, Movie movie2) {
                return movie1.getTitle().compareTo(movie2.getTitle());
            }
        });


        //Create a predicate for release date before 2000
        // and a predicate for release date before 1990
        // and then Chain the predicates for finding movies between 1990 and 2000.
        Filter.Chain chain =(predicateAfter1900(movies), predicateBefore2000(movies));
    }//end of main

    //Create a predicate for release date before 2000
    // and a predicate for release date before 1990
    // and then Chain the predicates for finding movies between 1990 and 2000.
    public static ArrayList<Movie> predicateAfter1900 (ArrayList<Movie> movies){
        ArrayList<Movie> list = new ArrayList<>();
        for (Movie movie : movies){
            if (movie.releaseDate.after(1990)){
                list.add(movie);
            }
        }
        return list;
    }

    public static ArrayList<Movie> predicateBefore2000 (ArrayList<Movie> movies){
        ArrayList<Movie> list = new ArrayList<>();
        for (Movie movie : movies){
            if (movie.releaseDate.before(2000)){
                list.add(movie);
            }
        }
        return list;
    }

    //Write a method which that will add release year in the title of the movie
    // and return the title and then use this method for all the movies.
    public static String addYearInTitle(Movie movie){
        movie.title = movie.title + movie.releaseDate.getWeekYear();
        return movie.title;
    }

    //Add List of movies based on the classes created above.
    private static ArrayList<Genre> generateGenre(){
        Genre science = new Genre("Science");
        Genre Romantic = new Genre("Romantic");
        ArrayList<Genre> list = new ArrayList<>();
        list.add(science);
        list.add(Romantic);
        return list;
    }//end of generateGenre

    private static void addScience(Genre science){
        GregorianCalendar date = new GregorianCalendar(1991,1,1);
        science.addMovies(new Movie("title1", date, "Director 1"));
        date = new GregorianCalendar(1987,1,1);
        science.addMovies(new Movie("title2", date,"Director 2"));
        date = new GregorianCalendar(2001, 1, 1);
        science.addMovies(new Movie("title3", date, "Director 3"));
        date = new GregorianCalendar(1996, 1, 1);
        science.addMovies(new Movie("title4", date, "Director 4"));
    }//end of addScience

}//end of Main
