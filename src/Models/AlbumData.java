package Models;

import com.google.gson.annotations.SerializedName;

public class AlbumData {

    private String strAlbum;

    private String strArtist;

    private String strGenre;

    private String intYearReleased;

    private  String strAlbumThumb;

    private  String strDescriptionEN;


    public AlbumData(String strAlbum, String strArtist, String strGenre, String intYearReleased, String strAlbumThumb, String strDescriptionEN) {
        setStrAlbum(strAlbum);
        setStrArtist(strArtist);
        setStrGenre(strGenre);
        setIntYearReleased(intYearReleased);
        setStrAlbumThumb(strAlbumThumb);
        setStrDescriptionEN(strDescriptionEN);
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

    public String getStrGenre() {
        return strGenre;
    }

    public void setStrGenre(String strGenre) {
        this.strGenre = strGenre;
    }

    public String getIntYearReleased() {
        return intYearReleased;
    }

    public void setIntYearReleased(String intYearReleased) {
        this.intYearReleased = intYearReleased;
    }

    public String getStrAlbumThumb() {
        return strAlbumThumb;
    }

    public void setStrAlbumThumb(String strAlbumThumb) {
        this.strAlbumThumb = strAlbumThumb;
    }

    public String getStrDescriptionEN() {
        return strDescriptionEN;
    }

    public void setStrDescriptionEN(String strDescriptionEN) {
        this.strDescriptionEN = strDescriptionEN;
    }

    @Override
    public String toString() {
        return String.format("Album: %s, Artist: %s, Genre: %s, Release Date: %s",this.strAlbum,this.strArtist,this.strGenre,this.intYearReleased);
    }
}
