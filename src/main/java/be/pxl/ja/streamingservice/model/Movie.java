package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements Playable{
    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;
    public static int LONG_PLAYING_TIME = 135;

    public Movie(String title, Rating maturityRating) {
        super(title, maturityRating);
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void play() {
        System.out.println("Playing "+ this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }

    public boolean isLongPlayingTime(){
        return duration > LONG_PLAYING_TIME;
    }

    public String getPlayingTime(){
        String result = "";
        if (duration == 0) {
            result = "?";
        }
        else if(duration < 60){
            String d = String.valueOf(duration);
            result = d + " min";
        }
        else if(duration >= 60){
            int hour = 0;
            while(duration >= 60){
                hour += 1;
                duration -= 60;
            }
            String h = String.valueOf(hour);
            String d = String.valueOf(duration);
            if (duration == 0){
                result = h + " h";
            }
            else {
                result = h + " h " + d + " min";
            }
        }
        return result;
    }

    public void setDuration(int duration) {
        if (duration > 0){
            this.duration = duration;
        }
        else {
            this.duration = duration * -1;
        }
    }

    @Override
    public String toString() {
        return "\ndirector(s): " + director +
                "\nrelease year: " + releaseDate.getYear();
    }
}
