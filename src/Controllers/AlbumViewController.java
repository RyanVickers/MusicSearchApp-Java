package Controllers;

import Models.AlbumData;
import Utilities.JSONUtility;
import Utilities.MusicApiUtility;
import Utilities.SceneChangerUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class AlbumViewController implements Initializable {

    @FXML
    private Label albumLabel;

    @FXML
    private Label artistLabel;

    @FXML
    private Label genreLabel;

    @FXML
    private Label releaseLabel;

    @FXML
    private TextArea descriptionArea;

    @FXML
    private ImageView imageView;

    private ArrayList<AlbumData> album = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        getAlbum();


    }

    private void getAlbum() {
        try {
            album.addAll(JSONUtility.getAlbumList("src/JSONData/albumInfo.json"));
            albumLabel.setText(album.get(0).getStrAlbum());
            artistLabel.setText(album.get(0).getStrArtist());
            genreLabel.setText(album.get(0).getStrGenre());
            releaseLabel.setText(album.get(0).getIntYearReleased());
            descriptionArea.setText(album.get(0).getStrDescriptionEN());
            try {
                imageView.setImage(new Image(album.get(0).getStrAlbumThumb()));
            } catch (Exception e) {
                imageView.setImage(new Image("/Views/default-image.png"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void backToAlbumList(ActionEvent event) {
        try {
            SceneChangerUtility.changeScene(event, "/Views/searchView.fxml", "Boats");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
