package Models;

import com.google.gson.annotations.SerializedName;

public class SearchResult {
    @SerializedName("album")
    private AlbumData[] albums;


    public SearchResult(AlbumData[] albums) {
        setAlbums(albums);

    }

    /**
     * Method returns list of albums
     *
     * @return
     */
    public AlbumData[] getAlbums() {
        return albums;
    }

    /**
     * method sets list of albums must contain at least one
     *
     * @param albums
     */
    public void setAlbums(AlbumData[] albums) {
        if (albums.length >= 1)
            this.albums = albums;
        else
            throw new IllegalArgumentException("No Albums");
    }

}
