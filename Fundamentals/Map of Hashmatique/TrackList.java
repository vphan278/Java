import java.util.HashMap;

public class TrackList {

    public HashMap<String, String> getTrackList(){

        HashMap<String, String> tracks = new HashMap<String, String>();

        tracks.put("First Song of track", "Can't wait for you");
        tracks.put("Second Song of track","Me and You");
        tracks.put("Third Song of Track", "The sky is blue");
        tracks.put("Fourth Song of track", "Swimming in the pool");

        return tracks;

    }
    
}
