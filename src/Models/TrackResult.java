package Models;

import com.google.gson.annotations.SerializedName;

public class TrackResult {
    @SerializedName("track")
    private TrackData[] tracks;


    public TrackResult(TrackData[] tracks) {
        setTracks(tracks);

    }

    public TrackData[] getTracks() {
        return tracks;
    }

    public void setTracks(TrackData[] tracks) {
        this.tracks = tracks;
    }
}