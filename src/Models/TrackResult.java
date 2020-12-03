package Models;

import com.google.gson.annotations.SerializedName;

public class TrackResult {
    @SerializedName("track")
    private TrackData[] tracks;


    public TrackResult(TrackData[] tracks) {
        setTracks(tracks);

    }

    /**
     * Method returns list of tracks from album
     *
     * @return
     */
    public TrackData[] getTracks() {
        return tracks;
    }

    /**
     * Method sets list of tracks must contain 1
     *
     * @param tracks
     */
    public void setTracks(TrackData[] tracks) {
        if (tracks.length > 0)
            this.tracks = tracks;
        else
            throw new IllegalArgumentException("No tracks");
    }
}