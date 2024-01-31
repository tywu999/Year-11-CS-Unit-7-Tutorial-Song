import java.util.*;

public class Song {

    private String title = "";
    private String artist = "";
    private ArrayList<String> list;

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
        this.list = new ArrayList<>(Arrays.asList("abc", "sdf"));
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public int howMany(ArrayList<String> listener){
        int newListeners = 0;
        for(int i = 0; i < listener.size(); i++){
            String z = (listener.get(i)).toLowerCase();
            if(!list.contains(z)){
                list.add(z);
                newListeners++;
            }
        }
        return newListeners;
    }
}
