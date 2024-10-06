package Playlist;

public class Song {
    // write code here

    private String title;
    private double duration;

    public Song(String title, double duration){
        this.title = title;
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }

    // public double getDuration() {
    //     return duration;
    // }

    public String toString(){
        return (""+title+": "+duration);
    }
}
