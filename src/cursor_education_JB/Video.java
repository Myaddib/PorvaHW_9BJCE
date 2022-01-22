package cursor_education_JB;

public class Video {
    String nameVideo;
    double price;
    CategoryFilmGenres genre;

    public Video(String nameFilm, double priceFilm, CategoryFilmGenres genreFilm) {
        this.nameVideo = nameFilm;
        this.price = priceFilm;
        this.genre = genreFilm;
    }

    public String getNameVideo() {
        return nameVideo;
    }

    public void setNameVideo(String nameVideo) {
        this.nameVideo = nameVideo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CategoryFilmGenres getGenre() {
        return genre;
    }

    public void setGenre(CategoryFilmGenres genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie picture{" +
                "nameVideo='" + nameVideo + '\'' +
                ", price=" + price +
                ", genre=" + genre +
                '}';
    }
}
