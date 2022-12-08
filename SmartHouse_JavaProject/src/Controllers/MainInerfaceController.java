package Controllers;

import java.io.IOException;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Control;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

public class MainInerfaceController {

	@FXML 
	private StackPane contentArea;

	public void onClickedEvent(MouseEvent mouseEvent) throws IOException {
		if(((Control)mouseEvent.getSource()).getId().toString().equals("DashBoardButton")) {
			Parent fxml = FXMLLoader.load(getClass().getResource("/FXML/MainInterface.fxml"));
			contentArea.getChildren().removeAll();
			contentArea.getChildren().setAll(fxml);

		}
		
		if(((Control)mouseEvent.getSource()).getId().toString().equals("DashBoardButton")) {
			contentArea.getChildren().removeAll();

			changeContentArea("widgets");
			
		}
		if(((Control)mouseEvent.getSource()).getId().toString().equals("MembersButton")) {
			contentArea.getChildren().removeAll();

			changeContentArea("MembersInterface");
		}
		
		if(((Control)mouseEvent.getSource()).getId().toString().equals("RoomsButton")) {
			contentArea.getChildren().removeAll();

			changeContentArea("RoomsInterface");
		}
		if(((Control)mouseEvent.getSource()).getId().toString().equals("MembersButton1")) {
			contentArea.getChildren().removeAll();

			changeContentArea("Database");
		}
	}
	
	public void changeContentArea(String interfaceName) throws IOException {
		Parent fxml = FXMLLoader.load(getClass().getResource("/FXML/"+interfaceName+".fxml"));
		contentArea.getChildren().removeAll();
		contentArea.getChildren().setAll(fxml);
	}
}
