import java.util.List;

public class AudiobookMetadata {

    private List<String> stores;
    private String genre;
    private String publishDate;
    //duration in seconds
    private double durationInSeconds;

    public AudiobookMetadata(List<String> stores, String genre, String publishDate, double durationInSeconds) {
        this.stores = stores;
        this.genre = genre;
        this.publishDate = publishDate;
        this.durationInSeconds = durationInSeconds;
    }
    public AudiobookMetadata() {

    }

    public List<String> getStores() {
        return stores;
    }

    public void setStores(List<String> stores) {
        this.stores = stores;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public double getdurationInSeconds() {
        return durationInSeconds;
    }

    public void setdurationInSeconds(double durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    //TODO: task 4: define function that prints out the duration of the audiobook in minutes
    public void printAudioBookDurationInMinutes(){
        System.out.println(durationInSeconds / 60.0 + " minutes");    
    }

}
