package be.pxl.ja.streamingservice.model;

public class TVShow  extends Content{
    private int numberOfSeasongs;

    public TVShow(String title, Rating maturityRating, int numberOfSeasongs) {
        super(title, maturityRating);
        this.numberOfSeasongs = numberOfSeasongs;
    }

    public int getNumberOfSeasongs() {
        return numberOfSeasongs;
    }
}
