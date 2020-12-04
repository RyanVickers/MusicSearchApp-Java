
import Models.AlbumData;
import Utilities.JSONUtility;
import Utilities.MusicApiUtility;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {
    public static void main(String[] args) throws IOException, InterruptedException {
        //  ArrayList<AlbumData> albums;
        // MusicApiUtility.getAlbum("cher");
        //JSONUtility.getAlbumList("src/JSONData/albumSearch.json");
        // System.out.println();
        launch(args);
    }

    @Override
    /**
     * Start application method
     */
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Views/searchView.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/style.css");
        stage.setScene(scene);
        stage.getIcons().add(new Image("Views/icon.png"));
        stage.setTitle("Album Search");
        stage.show();
    }
}
