package Models;

public class TrackData {
    private String strTrack;
    private String strAlbum;
    private String intDuration;

    public TrackData(String strTrack, String strAlbum, String intDuration) {
        setStrTrack(strTrack);
        setStrAlbum(strAlbum);
        setIntDuration(intDuration);
    }

    /**
     * Method gets track name
     *
     * @return
     */
    public String getStrTrack() {
        return strTrack;
    }

    /**
     * Method set track name must be between 0-100 letters
     *
     * @param strTrack
     */
    public void setStrTrack(String strTrack) {
        if (strTrack.length() > 0 && strAlbum.length() < 100)
            this.strTrack = strTrack;
        else
            throw new IllegalArgumentException("Track name is too long or missing");
    }

    /**
     * Method get track album
     *
     * @return
     */
    public String getStrAlbum() {
        return strAlbum;
    }

    /**
     * Method sets album name track are from
     *
     * @param strAlbum
     */
    public void setStrAlbum(String strAlbum) {
        if (strAlbum.length() > 0 && strAlbum.length() < 100)
            this.strAlbum = strAlbum;
        else
            throw new IllegalArgumentException("Album name is too long or missing");
    }

    /**
     * Method gets duration of track
     *
     * @return
     */
    public String getIntDuration() {
        return intDuration;
    }

    /**
     * Method sets duration of track must be between 0-20
     *
     * @param intDuration
     */
    public void setIntDuration(String intDuration) {
        if (Double.parseDouble(intDuration) >= 0 && Double.parseDouble(intDuration) < 20)
            this.intDuration = intDuration;
        else
            throw new IllegalArgumentException("Duration must be greater than 0 and less than 20");
    }

    /**
     * toString method to display track info
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("Track Name: %s, Duration: %s", strTrack, intDuration);
    }
}
