package sample;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Controller {
    @FXML public TextField name_field;
    @FXML public TextField uname_field;
    @FXML public TextField email_field;
    @FXML public PasswordField pass_field;

    public void form() throws SQLException, ClassNotFoundException {

        String n = name_field.getText();
        String u = uname_field.getText();
        String e = email_field.getText();
        String p = pass_field.getText();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://artemis.ctesyh3pf9ly.ap-south-1.rds.amazonaws.com:3306/methys","admin","password");
        String quot= String.format("INSERT INTO Table2 VALUES (NULL,'%s','%s','%s','%s')", n,u,e,p);
        PreparedStatement pst = con.prepareStatement(quot);
        pst.execute();
    }
}
