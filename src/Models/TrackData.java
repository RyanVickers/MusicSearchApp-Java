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

    public String getStrTrack() {
        return strTrack;
    }

    public void setStrTrack(String strTrack) {
        this.strTrack = strTrack;
    }

    public String getStrAlbum() {
        return strAlbum;
    }

    public void setStrAlbum(String strAlbum) {
        this.strAlbum = strAlbum;
    }

    public String getIntDuration() {
        return intDuration;
    }

    public void setIntDuration(String intDuration) {
        this.intDuration = intDuration;
    }

    @Override
    public String toString() {
        return String.format("%s from %s",this.strTrack,this.strAlbum);
    }
}
