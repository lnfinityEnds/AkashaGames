package views;


import com.gluonhq.charm.glisten.control.Avatar;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class NewCountController {

    @FXML
    private BorderPane panelFondo;

    @FXML
    private TextField nameField;

    @FXML
    private TextField surnameField;

    @FXML
    private ChoiceBox<Integer> ageChoiceBox;

    @FXML
    private ChoiceBox<String> genderChoiceBox;

    @FXML
    private TextField phoneField;

    @FXML
    private TextField addressField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private Avatar avatar;

    @FXML
    private Button createAccountButton;

    @FXML
    private Label errorLabel;

    // Inicialización del controlador
    @FXML
    private void initialize() {
        // Configurar elementos iniciales, como llenar ChoiceBox con opciones
        ageChoiceBox.getItems().addAll(generateAgeRange());
        genderChoiceBox.getItems().addAll("Masculino", "Femenino", "Otro");
        errorLabel.setText(""); // Asegúrate de que el error esté vacío inicialmente
    }

    // Método para manejar el clic en el botón "Crear Cuenta Nueva"
    @FXML
    private void handleCreateAccount() {
        String name = nameField.getText();
        String surname = surnameField.getText();
        Integer age = ageChoiceBox.getValue();
        String gender = genderChoiceBox.getValue();
        String phone = phoneField.getText();
        String address = addressField.getText();
        String email = emailField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (validateInputs(name, surname, age, gender, phone, address, email, username, password, confirmPassword)) {
            // Aquí puedes manejar la lógica para guardar los datos en la base de datos o servicio
            System.out.println("Cuenta creada correctamente para: " + username);
        }
    }

    // Validar los campos de entrada
    private boolean validateInputs(String name, String surname, Integer age, String gender, String phone, String address, String email, String username, String password, String confirmPassword) {
        if (name.isEmpty() || surname.isEmpty() || age == null || gender == null ||
            phone.isEmpty() || address.isEmpty() || email.isEmpty() ||
            username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            errorLabel.setText("Todos los campos son obligatorios.");
            return false;
        }

        if (!password.equals(confirmPassword)) {
            errorLabel.setText("Las contraseñas no coinciden.");
            return false;
        }

        if (!email.contains("@")) {
            errorLabel.setText("El correo electrónico no es válido.");
            return false;
        }

        errorLabel.setText(""); // Limpiar cualquier error anterior
        return true;
    }

    // Generar rango de edades para el ChoiceBox
    private Integer[] generateAgeRange() {
        Integer[] ages = new Integer[100];
        for (int i = 0; i < 100; i++) {
            ages[i] = i + 1;
        }
        return ages;
    }
}

