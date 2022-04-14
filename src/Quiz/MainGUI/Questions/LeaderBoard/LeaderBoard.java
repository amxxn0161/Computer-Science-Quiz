package Quiz.MainGUI.Questions.LeaderBoard;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;


public class LeaderBoard {

    public Button CloseQuiz;
    public Button GoBackToHome;
    public Button counter;

    public int totalcount = 0;


    public void MainMenu(ActionEvent actionEvent) throws IOException {
        Window mainWindow = GoBackToHome.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("../../MainMenu.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }

    public void Exit(ActionEvent actionEvent) throws IOException {
        ((Stage) CloseQuiz.getScene().getWindow()).close();
    }

    public void updateCount(ActionEvent actionEvent) {
        String currentString = counter.getText();
        int currentValue = Integer.parseInt(currentString);
        counter.setText("" + totalcount);
    }
}
