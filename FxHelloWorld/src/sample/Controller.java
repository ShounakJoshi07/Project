package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.*;

public class Controller {
    @FXML public TextField name_field;
    @FXML public Label out;
    String n;

    public void hello() throws SQLException, ClassNotFoundException {
        n = name_field.getText();
        out.setText(n);

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Orion","root","password");
        String quot= String.format("INSERT INTO Table1 VALUES (NULL,'%s')", n);
        PreparedStatement pst = con.prepareStatement(quot);
        pst.execute();
    }
    
}
