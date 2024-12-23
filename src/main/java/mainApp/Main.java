package mainApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/Login.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/css/Style.css").toExternalForm());

        primaryStage.setTitle("Akasha Games Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
