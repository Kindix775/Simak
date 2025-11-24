package controller;

import dao.UserDao;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.User;

public class LoginController {

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Label lblStatus;

    private UserDao userDao = new UserDao();

    @FXML
    private void handleLogin() {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        User u = userDao.login(username, password);

        if (u != null) {
            lblStatus.setText("Login Berhasil!");
        } else {
            lblStatus.setText("Username/Password salah!");
        }
    }
}
