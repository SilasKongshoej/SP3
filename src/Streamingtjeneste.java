import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Streamingtjeneste {
    ArrayList<Movie> movies = new ArrayList<>();
public void createMovies() {
    File file = new File("data/film.csv");
    try {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split(";");
            String title = values[0].trim();
            int year = Integer.parseInt(values[1].trim());
            String[] genre = values[2].trim().split(",");
            double rating = Double.parseDouble(values[3].trim().replaceAll(",","."));
            Movie m = new Movie(title, year, genre, rating);
            movies.add(m);

        }
    } catch (FileNotFoundException e) {
        System.out.println("File not found!");
    }
}
   public void showMovies(){
       for (Movie m: movies){

           System.out.println(m);

       }

    }

    public void searchByGenre(String genre){

        for (Movie m: movies){

           if (Arrays.asList(m.movieGenre).contains(genre)){

               System.out.println(m);
           }

        }

    }
}






