package Film;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Film {
    FilmInfo oppenheimer = new FilmInfo("Oppenheimer", "Christopher Nolan", LocalDate.of(2023, 7, 20), "thriller", 7);
    FilmInfo jurassicPark = new FilmInfo("Jurassic Park", "Steven Spielberg", LocalDate.of(1993, 9, 10), "adventure", 3);
    FilmInfo getOut = new FilmInfo("Get Out", "Jordan Peele", LocalDate.of(2017, 4, 20), "horror", 1);
    FilmInfo titanic = new FilmInfo("Titanic", "James Cameron", LocalDate.of(1998, 1, 29), "romance", 11);

    public void printFilmList() {

        System.out.println("De film " + oppenheimer.getTitle() + " is geregisseerd door " + oppenheimer.getDirector() + " en was voor het eerst te zien op " + oppenheimer.getReleaseDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + ".");
        System.out.println("Deze " + oppenheimer.getGenre() + "film heeft " + oppenheimer.getOscars() + " keer een oscar gewonnen.");

        System.out.println("De film " + jurassicPark.getTitle() + " is geregisseerd door " + jurassicPark.getDirector() + " en was voor het eerst te zien op " + jurassicPark.getReleaseDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + ".");
        System.out.println("Deze " + jurassicPark.getGenre() + "film heeft " + jurassicPark.getOscars() + " keer een oscar gewonnen.");

        System.out.println("De film " + getOut.getTitle() + " is geregisseerd door " + getOut.getDirector() + " en was voor het eerst te zien op " + getOut.getReleaseDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + ".");
        System.out.println("Deze " + getOut.getGenre() + "film heeft " + getOut.getOscars() + " keer een oscar gewonnen.");

        System.out.println("De film " + titanic.getTitle() + " is geregisseerd door " + titanic.getDirector() + " en was voor het eerst te zien op " + titanic.getReleaseDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + ".");
        System.out.println("Deze " + titanic.getGenre() + "film heeft " + titanic.getOscars() + " keer een oscar gewonnen.");

    }

}
