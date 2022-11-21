package Controllers;

import java.net.URL;

import java.util.ResourceBundle;

import connectivity.ConnectionClass;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MembersInterfaceController{
	 public TextField textField;
	    public Label textLabel;
	    public TextField userName;

	    public Label isConnected;
	    public PasswordField userPassword;
	
	public void button(ActionEvent actionEvent) throws SQLException {
        textLabel.setText(textField.getText());
        System.out.println("Program is running");
    }

    public void login(ActionEvent actionEvent) {

        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();

        try {
            Statement statement=connection.createStatement();
            String sql="SELECT * FROM userauth WHERE username = '"+userName.getText()+"' AND password = '"+userPassword.getText()+"';";
            ResultSet resultSet=statement.executeQuery(sql);

            if (resultSet.next()){
                isConnected.setText("Connected");
            }else {

                isConnected.setText("Not Connected");
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

