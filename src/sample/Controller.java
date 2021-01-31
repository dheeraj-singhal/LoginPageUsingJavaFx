package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends Object implements Initializable {

    public javafx.scene.control.Label result;

    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField passwordTextField;

    @FXML
    private void handleButtonAction(javafx.event.ActionEvent event) {
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();

        if (username.equals("Dheeraj") && password.equals("Java")) {
            result.setText("Logged In");
        } else {
            result.setText("Please, check Username and Password !");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
