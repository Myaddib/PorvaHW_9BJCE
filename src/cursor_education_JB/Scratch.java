package cursor_education_JB;

import java.util.List;
import java.util.stream.Collectors;

public class Scratch {
    static List<Video> video;
    static CategoryFilmGenres film;


    public Scratch(List<Video> video,CategoryFilmGenres film){
        this.video=video;
        this.film=film;
    }

    public void ActionAveragePrice() {

        var scratch = video.stream()
                .filter(it -> it.getGenre() == film)
                .collect(Collectors.averagingDouble(Video::getPrice));
        System.out.println("=" + scratch);
    }
}