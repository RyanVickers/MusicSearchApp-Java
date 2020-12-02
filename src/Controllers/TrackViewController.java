package Controllers;


import Models.TrackData;
import Models.TrackResult;
import Utilities.JSONUtility;
import Utilities.MusicApiUtility;
import Utilities.SceneChangerUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TrackViewController implements Initializable {
    @FXML
    private ListView<TrackData> trackListView;

    @FXML
    private Label rowsReturnedLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        trackListView.getItems().clear();
        try {
             trackListView.getItems().addAll(JSONUtility.getTrackList("src/JSONData/trackInfo.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        updateLabels();
    }

    private void updateLabels() {
        rowsReturnedLabel.setText("Rows Returned: " + trackListView.getItems().size());
    }

    @FXML
    private void backToDetailsView(ActionEvent event) {
        try {
            SceneChangerUtility.changeScene(event, "/Views/albumView.fxml", "Album Details");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void backToAlbumList(ActionEvent event) {
        try {
            SceneChangerUtility.changeScene(event, "/Views/searchView.fxml", "Album Search");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
