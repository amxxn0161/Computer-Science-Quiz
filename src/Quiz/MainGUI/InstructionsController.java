package Quiz.MainGUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class InstructionsController {

    public Button GoBackButton;

    public void goBack(ActionEvent actionEvent) throws IOException {
        Window mainWindow = GoBackButton.getScene().getWindow();
        ((Stage)GoBackButton.getScene().getWindow()).close();

    }
}
