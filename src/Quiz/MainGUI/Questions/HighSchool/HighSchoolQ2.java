package Quiz.MainGUI.Questions.HighSchool;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Window;

import java.io.IOException;


public class HighSchoolQ2 {

    public Button Q2WrongAns1;
    public Button Q2WrongAns2;
    public Button Q2CorrectAns;
    public Button Q2WrongAns3;
    
    public void Q2CorrectAns(ActionEvent actionEvent) throws IOException {
        Window mainWindow = Q2CorrectAns.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("../LeaderBoard/LeaderBoard.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }

    public void WrongAns1(ActionEvent actionEvent) throws IOException {
        Window mainWindow = Q2WrongAns1.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("../LeaderBoard/LeaderBoard.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }
    public void WrongAns2(ActionEvent actionEvent) throws IOException {
        Window mainWindow = Q2WrongAns2.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("../LeaderBoard/LeaderBoard.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }
    public void WrongAns3(ActionEvent actionEvent) throws IOException {
        Window mainWindow = Q2WrongAns3.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("../LeaderBoard/LeaderBoard.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }
}
