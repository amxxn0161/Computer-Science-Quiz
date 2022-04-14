package Quiz.MainGUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        primaryStage.setTitle("Cup O Java Computing Quiz");
        primaryStage.setScene(new Scene(root, 250, 350));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
