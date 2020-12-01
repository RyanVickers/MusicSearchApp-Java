package Models;

import com.google.gson.annotations.SerializedName;

public class SearchResult {
    @SerializedName("album")
    private AlbumData[] albums;


    public SearchResult(AlbumData[] albums) {
        setAlbums(albums);

    }
    public AlbumData[] getAlbums() {
        return albums;
    }

    public void setAlbums(AlbumData[] albums) {
        this.albums = albums;
    }

}
