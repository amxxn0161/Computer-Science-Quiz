package Quiz.MainGUI.Questions.University;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;


public class UniversityQ5 {

    public Button Q5WrongAns1;
    public Button Q5WrongAns2;
    public Button Q5CorrectAns;
    public Button Q5WrongAns3;

    public void CorrectAns(ActionEvent actionEvent) throws IOException {
        Scene newScene = new Scene(FXMLLoader.load(getClass().getResource("CorrectAns.fxml")));

        Stage popUpStage = new Stage();
        popUpStage.setScene(newScene);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.show();

        Window mainWindow = Q5CorrectAns.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("../LeaderBoard/LeaderBoard.fxml"));
        mainWindow.getScene().setRoot(newRoot);

    }

    public void WrongAns1(ActionEvent actionEvent) throws IOException {
        Scene newScene = new Scene(FXMLLoader.load(getClass().getResource("InCorrectAns.fxml")));

        Stage popUpStage = new Stage();
        popUpStage.setScene(newScene);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.show();

        Window mainWindow = Q5WrongAns1.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("../LeaderBoard/LeaderBoard.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }
    public void WrongAns2(ActionEvent actionEvent) throws IOException {
        Scene newScene = new Scene(FXMLLoader.load(getClass().getResource("InCorrectAns.fxml")));

        Stage popUpStage = new Stage();
        popUpStage.setScene(newScene);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.show();

        Window mainWindow = Q5WrongAns2.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("../LeaderBoard/LeaderBoard.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }
    public void WrongAns3(ActionEvent actionEvent) throws IOException {
        Scene newScene = new Scene(FXMLLoader.load(getClass().getResource("InCorrectAns.fxml")));
        Stage popUpStage = new Stage();
        popUpStage.setScene(newScene);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.show();

        Window mainWindow = Q5WrongAns3.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("../LeaderBoard/LeaderBoard.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }
}