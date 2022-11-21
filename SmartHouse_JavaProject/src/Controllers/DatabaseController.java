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

import connectivity.ConnectionClass;

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

        ConnectionClass connectionClass=new ConnectionClass();
        Connection connection=connectionClass.getConnection();
        
        String sql="INSERT INTO USER VALUES ('"+textField.getText()+"')";
        Statement statement= connection.createStatement();
        statement.executeUpdate(sql) ;
        

  /*     try {
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
*/
    }
    
 }