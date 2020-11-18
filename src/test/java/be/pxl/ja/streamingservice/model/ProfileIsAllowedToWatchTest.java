package be.pxl.ja.streamingservice.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProfileIsAllowedToWatchTest {

    private Movie movie;
    private Profile profile;

    @BeforeEach
    void setUp() {
        movie = new Movie("Titanic", Rating.OLDER_KIDS);
        profile = new Profile();
        profile.setDateOfBirth(LocalDate.of(2001, 4, 3));
    }

    @Test
    void allowedToWatch() {
        assertTrue(profile.allowedToWatch(movie));
    }
}