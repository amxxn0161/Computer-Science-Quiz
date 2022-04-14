package Quiz.MainGUI.Questions.College;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Window;

import java.io.IOException;


public class CollegeQ1{

    public Button Q1WrongAns1;
    public Button Q1WrongAns2;
    public Button Q1CorrectAns;
    public Button Q1WrongAns3;

    public void CorrectAns(ActionEvent actionEvent) throws IOException {
        Window mainWindow = Q1CorrectAns.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("CollegeQ2.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }

    public void WrongAns1(ActionEvent actionEvent) throws IOException {
        Window mainWindow = Q1WrongAns1.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("CollegeQ2.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }
    public void WrongAns2(ActionEvent actionEvent) throws IOException {
        Window mainWindow = Q1WrongAns2.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("CollegeQ2.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }
    public void WrongAns3(ActionEvent actionEvent) throws IOException {
        Window mainWindow = Q1WrongAns3.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("CollegeQ2.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }
}