package Quiz.MainGUI.Questions.University;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CorrectAns {

    public Button Close;

    public void Exit(ActionEvent actionEvent) {
            ((Stage)Close.getScene().getWindow()).close();
        }
    }



