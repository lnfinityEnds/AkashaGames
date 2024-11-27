package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private CheckBox rememberMe;

    @FXML
    private Button loginButton;

    @FXML
    private Button createAccountButton;

    @FXML
    private void handleLoginAction(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        boolean remember = rememberMe.isSelected();

        // Aquí puedes agregar la lógica de autenticación
        System.out.println("Usuario: " + username);
        System.out.println("Contraseña: " + password);
        System.out.println("Recuérdame: " + remember);
    }

    @FXML
    private void handleCreateAccountAction(ActionEvent event) {
        // Aquí puedes agregar la lógica para crear una cuenta nueva
        System.out.println("Crear cuenta nueva");
    }
}
