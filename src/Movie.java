public class Movie {

String title;
String[] movieGenre;
int year;
double movieRating;

public Movie(String title, int year, String[] movieGenre, double movieRating){

    this.title = title;
    this.year = year;
    this.movieGenre = movieGenre;
    this.movieRating = movieRating;

}

public String toString(){
    String s = this.title + ", " + this.year + ", " ;
    for(String genre: this.movieGenre){
    s += genre;

    }

    s += ", " + this.movieRating;
    return s;
}

}
