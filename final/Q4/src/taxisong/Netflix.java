package taxisong;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Netflix {
    String name;
    ArrayList<Genre> genres;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres = genres;
    }

    public void addGenre(Genre genre){
        this.genres.add(genre);
    }

    public Netflix(String name){
        this.name = name;
        this.genres = new ArrayList<>();
    }

    public Genre getGenre(String genreName){
        ArrayList<Genre> filter = (ArrayList<Genre>) genres.stream().
                filter(genre -> genre.getName().equalsIgnoreCase(genreName))
                .collect(Collectors.toList());
        if (filter.size() == 0){
            return null;
        }else {
            return filter.get(0);
        }
    }
}//end of Netflix
