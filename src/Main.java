public class Main {
    public static void main(String[] args){
        System.out.println("Velkommen til Chill!");
        System.out.println("Venligst indtast brugernavn/email og adgangskode.");
    Streamingtjeneste s = new Streamingtjeneste();
    s.createMovies();
    // s.showMovies();
    s.searchByGenre("Drama");
    }

}
