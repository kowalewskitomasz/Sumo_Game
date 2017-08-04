import controllers.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("views/main.fxml"));
        Parent root = loader.load();
        MainController mainController = loader.getController();
        primaryStage.setTitle("Sumo Game");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        mainController.setStage(primaryStage);
        mainController.setParent(root);
        root.requestFocus();
    }
}