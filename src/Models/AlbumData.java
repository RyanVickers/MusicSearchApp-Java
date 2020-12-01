package Models;

import com.google.gson.annotations.SerializedName;

public class AlbumData {

    @SerializedName("Name")
    private String name;

    @SerializedName("Artist")
    private String artist;

    @SerializedName("URL")
    private String url;

    @SerializedName("Mbid")
    private String Mbid;


    public AlbumData(String name, String artist, String url, String mbid) {
        setName(name);
        setArtist(artist);
        setUrl(url);
        setMbid(mbid);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMbid() {
        return Mbid;
    }

    public void setMbid(String mbid) {
        Mbid = mbid;
    }

}
