package Models;

import com.google.gson.annotations.SerializedName;

public class SearchResult {

    @SerializedName("Album")
    private AlbumData[] albums;

    private String totalResults;


    public SearchResult(AlbumData[] albums, String totalResults) {
        setAlbums(albums);
        setTotalResults(totalResults);
    }

    public AlbumData[] getAlbums() {
        return albums;
    }

    public void setAlbums(AlbumData[] albums) {
        this.albums = albums;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }
}
