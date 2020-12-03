package Controllers;

import Models.AlbumData;
import Utilities.JSONUtility;
import Utilities.MusicApiUtility;
import Utilities.SceneChangerUtility;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SearchViewController implements Initializable {

    @FXML
    private TextField searchTextField;

    @FXML
    private ListView<AlbumData> musicListView;

    @FXML
    private Label warningLabel;

    @FXML
    private Label rowsReturnedLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        musicListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<AlbumData>() {
            @Override
            public void changed(ObservableValue<? extends AlbumData> observable, AlbumData oldValue, AlbumData newValue) {
                try {
                    MusicApiUtility.getAlbum(newValue.getIdAlbum());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    private void updateLabels() {
        rowsReturnedLabel.setText("Rows Returned: " + musicListView.getItems().size());
    }

    @FXML
    private void getAlbums() {
        musicListView.getItems().clear();
        try {
            String artistName = searchTextField.getText();
            artistName = artistName.replace(" ", "_");
            MusicApiUtility.getAlbums(artistName);
            musicListView.getItems().addAll(JSONUtility.getAlbumList("src/JSONData/albumSearch.json"));
        } catch (IOException e) {
            warningLabel.setText("No Artist in Matching Name, Please try Again.");
        } catch (InterruptedException e) {
            warningLabel.setText("No Artist in Matching Name, Please try Again.");
        }
        updateLabels();
    }


    @FXML
    private void changeToDetailsView(MouseEvent event) {
        try {
            SceneChangerUtility.changeSceneMouse(event, "/Views/albumView.fxml", "Album Details");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
