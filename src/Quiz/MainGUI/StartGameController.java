package Quiz.MainGUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class StartGameController {

    public Button highSchoolButton;
    public Button CollegeButton;
    public Button universityButton;

    public void HighSchoolQuestions(ActionEvent actionEvent) throws IOException {
        Window mainWindow = highSchoolButton.getScene().getWindow();
        Parent newRoot= FXMLLoader.load(getClass().getResource("Questions/HighSchool/highSchoolQ1.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }

    public void CollegeQuestions(ActionEvent actionEvent) throws IOException{
        Window mainWindow = CollegeButton.getScene().getWindow();
        Parent newRoot= FXMLLoader.load(getClass().getResource("Questions/College/CollegeQ1.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }

    public void UniversityQuestions(ActionEvent actionEvent) throws IOException {
        Window mainWindow = universityButton.getScene().getWindow();
        Parent newRoot= FXMLLoader.load(getClass().getResource("Questions/University/UniversityQ1.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }
}
