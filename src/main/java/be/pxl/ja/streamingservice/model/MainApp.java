package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class MainApp {
    public static void main(String[] args) {
        Movie after = new Movie("After", Rating.MATURE);
        Movie aBornStar = new Movie("A Born Star", Rating.MATURE);

        aBornStar.setDirector("Lady Gaga, Bradley Cooper");

        aBornStar.setReleaseDate(LocalDate.of(2018, 10, 3));

        System.out.println(aBornStar.toString());
    }
}
