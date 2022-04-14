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


public class UniversityQ2 {

    public Button Q2WrongAns1;
    public Button Q2WrongAns2;
    public Button Q2CorrectAns;
    public Button Q2WrongAns3;

    public void CorrectAns(ActionEvent actionEvent) throws IOException {
        Scene newScene = new Scene(FXMLLoader.load(getClass().getResource("CorrectAns.fxml")));

        Stage popUpStage = new Stage();
        popUpStage.setScene(newScene);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.show();

        Window mainWindow = Q2CorrectAns.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("UniversityQ3.fxml"));
        mainWindow.getScene().setRoot(newRoot);

    }

    public void WrongAns1(ActionEvent actionEvent) throws IOException {
        Scene newScene = new Scene(FXMLLoader.load(getClass().getResource("InCorrectAns.fxml")));

        Stage popUpStage = new Stage();
        popUpStage.setScene(newScene);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.show();

        Window mainWindow = Q2WrongAns1.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("UniversityQ3.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }
    public void WrongAns2(ActionEvent actionEvent) throws IOException {
        Scene newScene = new Scene(FXMLLoader.load(getClass().getResource("InCorrectAns.fxml")));

        Stage popUpStage = new Stage();
        popUpStage.setScene(newScene);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.show();

        Window mainWindow = Q2WrongAns2.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("UniversityQ3.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }
    public void WrongAns3(ActionEvent actionEvent) throws IOException {
        Scene newScene = new Scene(FXMLLoader.load(getClass().getResource("InCorrectAns.fxml")));

        Stage popUpStage = new Stage();
        popUpStage.setScene(newScene);
        popUpStage.initModality(Modality.APPLICATION_MODAL);
        popUpStage.show();

        Window mainWindow = Q2WrongAns3.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("UniversityQ3.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }
}