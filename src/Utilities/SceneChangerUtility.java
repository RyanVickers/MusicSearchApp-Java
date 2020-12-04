package Utilities;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneChangerUtility {
    /**
     * Method to change scenes for action events
     *
     * @param event
     * @param viewName
     * @param title
     * @throws IOException
     */
    public static void changeScene(ActionEvent event, String viewName, String title) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new Object() {
        }.getClass().getResource(viewName));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/Views/style.css");
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.getIcons().add(new Image("Views/icon.png"));
        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
    }

    /**
     * Method to change scenes for mouse events
     *
     * @param event
     * @param viewName
     * @param title
     * @throws IOException
     */
    public static void changeSceneMouse(MouseEvent event, String viewName, String title) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(new Object() {
        }.getClass().getResource(viewName));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/Views/style.css");
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.getIcons().add(new Image("Views/icon.png"));
        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
    }
}