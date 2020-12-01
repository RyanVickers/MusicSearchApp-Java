
import Models.AlbumData;
import Utilities.MusicApiUtility;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {
    public static void main(String[] args) {
        ArrayList<AlbumData> albums;
        try {
            MusicApiUtility.getAlbum("C418");
           // JSONUtility.getAlbumList("./src/JSONData/albumSearch.json");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
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
        stage.setTitle("Music Search");
        stage.show();
    }
}
