package Quiz.MainGUI.Questions.University;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class IncorrectAns {

    public Button Close;

    public void Exit(ActionEvent actionEvent) throws IOException {
            ((Stage)Close.getScene().getWindow()).close();
        }
    }

