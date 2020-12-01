package Models;

import com.google.gson.annotations.SerializedName;

public class AlbumData {

    private String idAlbum;

    private String strAlbum;

    private String strArtist;

    public AlbumData(String idAlbum, String strAlbum, String strArtist) {
        setIdAlbum(idAlbum);
        setStrAlbum(strAlbum);
        setStrArtist(strArtist);
    }

    public String getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(String idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getStrAlbum() {
        return strAlbum;
    }

    public void setStrAlbum(String strAlbum) {
        this.strAlbum = strAlbum;
    }

    public String getStrArtist() {
        return strArtist;
    }

    public void setStrArtist(String strArtist) {
        this.strArtist = strArtist;
    }

    @Override
    public String toString() {
        return String.format("Album: %s, Artist: %s", this.strAlbum, this.strArtist);
    }
}
