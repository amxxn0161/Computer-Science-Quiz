package Quiz.MainGUI.Questions.University;

import Quiz.MainGUI.Questions.LeaderBoard.LeaderBoard;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import java.io.IOException;

public class UniversityQ1{

    public Button Q1WrongAns1;
    public Button Q1WrongAns2;
    public Button Q1CorrectAns;
    public Button Q1WrongAns3;


    public void CorrectAns1(ActionEvent actionEvent) throws IOException {
        Scene newScene = new Scene(FXMLLoader.load(getClass().getResource("CorrectAns.fxml")));

        Stage popUpStage = new Stage();
        popUpStage.setScene(newScene);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.show();

        Window mainWindow = Q1CorrectAns.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("UniversityQ2.fxml"));
        mainWindow.getScene().setRoot(newRoot);

    }

    public void WrongAns1(ActionEvent actionEvent) throws IOException {
        Scene newScene = new Scene(FXMLLoader.load(getClass().getResource("InCorrectAns.fxml")));

        Stage popUpStage = new Stage();
        popUpStage.setScene(newScene);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.show();

        Window mainWindow = Q1WrongAns1.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("UniversityQ2.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }
    public void WrongAns2(ActionEvent actionEvent) throws IOException {
        Scene newScene = new Scene(FXMLLoader.load(getClass().getResource("InCorrectAns.fxml")));

        Stage popUpStage = new Stage();
        popUpStage.setScene(newScene);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.show();

        Window mainWindow = Q1WrongAns2.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("UniversityQ2.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }
    public void WrongAns3(ActionEvent actionEvent) throws IOException {
        Scene newScene = new Scene(FXMLLoader.load(getClass().getResource("InCorrectAns.fxml")));

        Stage popUpStage = new Stage();
        popUpStage.setScene(newScene);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.show();

        Window mainWindow = Q1WrongAns3.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("UniversityQ2.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }
}