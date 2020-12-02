package Controllers;


import Models.TrackData;
import Utilities.JSONUtility;
import Utilities.MusicApiUtility;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TrackViewController implements Initializable {
    @FXML
    private ListView<TrackData> trackListView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        trackListView.getItems().clear();
        try {
             trackListView.getItems().addAll(JSONUtility.getTrackList("src/JSONData/trackInfo.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
