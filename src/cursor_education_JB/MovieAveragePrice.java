package cursor_education_JB;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieAveragePrice {

    private     List<List<Video>> list;

    public MovieAveragePrice (List<List<Video>> list) {
        this.list = list;
    }

    public Double showMovieAveragePrice(CategoryFilmGenres T){
        var listOfAllGenre = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        Supplier<Stream<Video>> streamOfMovies = listOfAllGenre::stream;
        var actionAveragePrice =  streamOfMovies.get()
                .filter(it -> it.getGenre() == T)
                .collect(Collectors.averagingDouble(Video::getPrice));
        return actionAveragePrice;
    }

}
