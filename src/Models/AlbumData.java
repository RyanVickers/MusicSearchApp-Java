package Models;

import com.google.gson.annotations.SerializedName;

import java.util.Calendar;

public class AlbumData {
    private String idAlbum;
    private String strAlbum;
    private String strArtist;
    private String strGenre;
    private String intYearReleased;
    private String intScore;
    private String strAlbumThumb;
    private String strDescriptionEN;

    public AlbumData(String idAlbum, String strAlbum, String strArtist, String strGenre, String intYearReleased, String intScore, String strAlbumThumb, String strDescriptionEN) {
        setIdAlbum(idAlbum);
        setStrAlbum(strAlbum);
        setStrArtist(strArtist);
        setStrGenre(strGenre);
        setIntYearReleased(intYearReleased);
        setIntScore(intScore);
        setStrAlbumThumb(strAlbumThumb);
        setStrDescriptionEN(strDescriptionEN);
    }

    /**
     * Method returns album Id
     */
    public String getIdAlbum() {
        return idAlbum;
    }

    /**
     * Method sets Id
     *
     * @param idAlbum
     */
    public void setIdAlbum(String idAlbum) {
        if (!idAlbum.isBlank())
            this.idAlbum = idAlbum;
        else
            throw new IllegalArgumentException("Album must contain Id");
    }

    /**
     * Method gets album name
     *
     * @return
     */
    public String getStrAlbum() {
        return strAlbum;
    }

    /**
     * Method sets album name
     *
     * @param strAlbum
     */
    public void setStrAlbum(String strAlbum) {

        this.strAlbum = strAlbum;
    }

    /**
     * Method gets artist name
     *
     * @return
     */
    public String getStrArtist() {
        return strArtist;
    }

    /**
     * Method sets artist name
     *
     * @param strArtist
     */
    public void setStrArtist(String strArtist) {
        if (strArtist.length() < 50) {
            this.strArtist = strArtist;
        } else
            throw new IllegalArgumentException("Artist name too long");
    }

    /**
     * Methods gets album genre
     *
     * @return
     */
    public String getStrGenre() {
        return strGenre;
    }

    /**
     * Method sets album genre
     *
     * @param strGenre
     */
    public void setStrGenre(String strGenre) {
        if (strGenre.length() < 20) {
            this.strGenre = strGenre;
        } else
            throw new IllegalArgumentException("Genre too long");
    }

    /**
     * Method gets album release date
     *
     * @return
     */
    public String getIntYearReleased() {
        return intYearReleased;
    }

    /**
     * Method sets album release date between 1800 and current day
     *
     * @param intYearReleased
     */

    public void setIntYearReleased(String intYearReleased) {
        if (Integer.parseInt(intYearReleased) > 1800 && Integer.parseInt(intYearReleased) <= Calendar.getInstance().get(Calendar.YEAR))
            this.intYearReleased = intYearReleased;
        else
            throw new IllegalArgumentException("Release date must be greater than 1800");
    }

    /**
     * Method gets album Rating
     *
     * @return
     */
    public String getIntScore() {
        return intScore;
    }

    /**
     * Method set album rating between 0-10
     *
     * @param intScore
     */
    public void setIntScore(String intScore) {
        if (Integer.parseInt(intScore) >= 0 && Integer.parseInt(intScore) <= 10)
            this.intScore = intScore;
        else
            throw new IllegalArgumentException("Rating must be between 0 and 10");
    }

    /**
     * Method gets album artwork
     *
     * @return
     */
    public String getStrAlbumThumb() {
        return strAlbumThumb;
    }

    /**
     * Method sets album thumbnail must be valid image
     *
     * @param strAlbumThumb
     */
    public void setStrAlbumThumb(String strAlbumThumb) {
        if (strAlbumThumb.matches("([^\\s]+(\\.(?i)(jpe?g|png|gif|bmp))$)"))
            this.strAlbumThumb = strAlbumThumb;
        else
            throw new IllegalArgumentException("Not a Image file");
    }

    /**
     * Method gets description
     *
     * @return
     */
    public String getStrDescriptionEN() {
        return strDescriptionEN;
    }

    /**
     * Method sets description must be less than 10000 letters
     *
     * @param strDescriptionEN
     */
    public void setStrDescriptionEN(String strDescriptionEN) {
        if (strDescriptionEN.isEmpty())
            this.strDescriptionEN = strDescriptionEN;
        else
            throw new IllegalArgumentException("Description is too long");
    }

    /**
     * toString method to display info
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("Album: %s, Artist: %s, Genre: %s, Release Date: %s", strAlbum, strArtist, strGenre, intYearReleased);
    }
}
