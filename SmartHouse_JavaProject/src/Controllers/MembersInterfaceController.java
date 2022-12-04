package Controllers;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

import DAL.ConnectionClass;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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
	
	public void addMemberButtonAction(ActionEvent actionEvent) throws IOException, InterruptedException {
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(getClass().getResource("/FXML/AddMemberDialog.fxml"));
		//Pane dialogPane = fxmlLoader.load();
		Parent root = fxmlLoader.load();    
		Scene scene = new Scene(root, 700, 200);
	        Stage stage = new Stage();
	        stage.initModality(Modality.APPLICATION_MODAL);
	        stage.setScene(scene);
	        stage.show();
		
		System.out.println("the button is clicked");
	}
    /*public void login(ActionEvent actionEvent) {

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

    }*/
}

