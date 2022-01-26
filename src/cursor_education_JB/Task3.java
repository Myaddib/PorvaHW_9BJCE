package cursor_education_JB;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {


    public void startTask() {
        // 3.Есть 2 коллекции с фильмами. У каждого Фильма есть цена
        // билета, жанр. По каждому жанру рассчитайте среднюю цену
        // билетов и подсчитайте фильмы определенного жанра.

        List<Video> moviesList1 = new ArrayList<>();
        moviesList1.add(new Video("Warcraft", 250, CategoryFilmGenres.FANTASY_FILM));
        moviesList1.add(new Video("Avatar", 150, CategoryFilmGenres.ARTHOUSE_SCIENCE_FICTION_FILM));
        moviesList1.add(new Video("John Carter", 101, CategoryFilmGenres.ARTHOUSE_SCIENCE_FICTION_FILM));
        moviesList1.add(new Video("Dune", 100, CategoryFilmGenres.ARTHOUSE_SCIENCE_FICTION_FILM));
        moviesList1.add(new Video("The Intern", 106, CategoryFilmGenres.COMEDY_FILM));
        moviesList1.add(new Video("The X-Files", 105, CategoryFilmGenres.DRAMA_FILM));
        moviesList1.add(new Video("The Petrified Forest", 170, CategoryFilmGenres.DRAMA_FILM));
        moviesList1.add(new Video("American Psycho", 101, CategoryFilmGenres.PSYCHOLOGICAL_THRILLER));

        List<List<Video>> list = new ArrayList<>();
        list.add(moviesList1);

        var listOfAllGenre = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        Supplier<Stream<Video>> streamOfMovies = listOfAllGenre::stream;

        var countMovies = streamOfMovies.get()
                .collect(Collectors.groupingBy(Video::getGenre, Collectors.counting()));
        System.out.println(countMovies);

        MovieAveragePrice movieAveragePrice =new MovieAveragePrice(list);

        System.out.println(CategoryFilmGenres.ARTHOUSE_SCIENCE_FICTION_FILM+" = "+movieAveragePrice.showMovieAveragePrice(CategoryFilmGenres.ARTHOUSE_SCIENCE_FICTION_FILM));

        System.out.println(CategoryFilmGenres.COMEDY_FILM+" = "+movieAveragePrice.showMovieAveragePrice(CategoryFilmGenres.COMEDY_FILM));

        System.out.println(CategoryFilmGenres.DRAMA_FILM+" = "+movieAveragePrice.showMovieAveragePrice(CategoryFilmGenres.DRAMA_FILM));

        System.out.println(CategoryFilmGenres.FANTASY_FILM+" = "+movieAveragePrice.showMovieAveragePrice(CategoryFilmGenres.FANTASY_FILM));

        System.out.println(CategoryFilmGenres.FANTASY_FILM+" = "+movieAveragePrice.showMovieAveragePrice(CategoryFilmGenres.FANTASY_FILM));

        System.out.println(CategoryFilmGenres.PSYCHOLOGICAL_THRILLER+" = "+movieAveragePrice.showMovieAveragePrice(CategoryFilmGenres.PSYCHOLOGICAL_THRILLER));
    }
}
