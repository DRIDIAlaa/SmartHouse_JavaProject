package Controllers;

import java.sql.SQLException;

import DAL.MembersAccess;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddMemberDialogController {
	@FXML
	private TextField nameTextField;
	@FXML
	private TextField roomsNameTextField;
	@FXML
	private TextField checkInTextField;
	@FXML
	private TextField checkOutTextField;
	@FXML 
	private Label invalidNameLabel;
	@FXML
	private Label invalidRoomLabel;
	@FXML 
	private Label invalidCheckInLabel;
	@FXML 
	private Label invalidCheckOutLabel;
	@FXML 
	private Button AddMemberButton;
	
	public void AddMemberButtonAction(ActionEvent actionEvent) throws SQLException {
		boolean valid = true;
		if(this.nameTextField.getText().equals("")) {
			this.invalidNameLabel.setVisible(true);
			valid = false;
		}
		if(this.roomsNameTextField.getText().equals("")) {
			this.invalidRoomLabel.setVisible(true);
			valid = false;
		}
		if(this.checkInTextField.getText().equals("")) {
			this.invalidCheckInLabel.setVisible(true);
			valid = false;
		}
		if(this.checkOutTextField.getText().equals("")) {
			this.invalidCheckOutLabel.setVisible(true);
			valid = false;
		}
		if(valid == true) {
			MembersAccess.addMember(this.nameTextField.getText(),this.roomsNameTextField.getText(),
					this.checkInTextField.getText(),this.checkOutTextField.getText());
			Stage stage = (Stage) this.AddMemberButton.getScene().getWindow();
		    stage.close();
			
		}
	}
}
