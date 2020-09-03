package sample;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Second {
    @FXML
    public TextField name_field;
    @FXML
    public TextField uname_field;
    @FXML
    public TextField email_field;
    @FXML
    public PasswordField pass_field;

    public void form() throws SQLException, ClassNotFoundException {


    }
}