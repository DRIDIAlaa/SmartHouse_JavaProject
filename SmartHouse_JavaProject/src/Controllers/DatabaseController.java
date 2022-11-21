package Controllers;

import java.sql.Connection;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DAL.ConnectionClass;
import DAL.MembersAccess;

public class DatabaseController {
    public TextField textField;
    public Label textLabel;
    public TextField userName;

    public Label isConnected;
    public PasswordField userPassword;

    public void button(ActionEvent actionEvent) throws SQLException {
        textLabel.setText(textField.getText());
        System.out.println("Program is running");
    }
    public void login(ActionEvent actionEvent) throws SQLException {

    	MembersAccess.addMember(textField.getText());
    }
    
 }