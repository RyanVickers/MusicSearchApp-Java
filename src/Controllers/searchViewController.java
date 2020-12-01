package Controllers;

import Models.AlbumData;
import Utilities.JSONUtility;
import Utilities.MusicApiUtility;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class searchViewController implements Initializable {

    @FXML
    private TextField textField;

    @FXML
    private ListView<AlbumData> musicListView;

    @FXML
    private ImageView imageView;

    @FXML
    private Label rowsReturnedLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        updateLabels();
    }


    private void updateLabels() {
        rowsReturnedLabel.setText("Rows Returned: " + musicListView.getItems().size());
    }
@FXML
    private void getAlbums() {
        musicListView.getItems().clear();
        try {
            MusicApiUtility.getAlbum(textField.getText());
            musicListView.getItems().addAll(JSONUtility.getAlbumList("src/JSONData/albumSearch.json"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        updateLabels();
    }
}
