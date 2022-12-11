package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddMemberDialogController {
	@FXML
	private TextField nameTextField;
	@FXML
	private TextField checkInTextField;
	@FXML
	private TextField checkOutTextField;
	@FXML 
	private Label invalidNameLabel;
	@FXML 
	private Label invalidCheckInLabel;
	@FXML 
	private Label invalidCheckOutLabel;
	
	public void AddMemberButtonAction(ActionEvent actionEvent) {
		boolean valid = false;
		if(this.nameTextField.getText().equals("")) {
			this.invalidNameLabel.setVisible(true);
		}
		if(this.checkInTextField.getText().equals("")) {
			this.invalidCheckInLabel.setVisible(true);
		}
		if(this.checkOutTextField.getText().equals("")) {
			this.checkOutTextField.setVisible(true);
		}
	}
}
