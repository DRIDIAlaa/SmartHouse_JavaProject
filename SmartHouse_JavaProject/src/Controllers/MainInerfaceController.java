package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Control;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

public class MainInerfaceController implements Initializable{

	@FXML 
	private StackPane contentArea;

	public void onClickedEvent(MouseEvent mouseEvent) throws IOException {
		if(((Control)mouseEvent.getSource()).getId().toString().equals("DashBoardButton")) {
			changeContentArea("widgets");
			
		}
		if(((Control)mouseEvent.getSource()).getId().toString().equals("MembersButton")) {
			contentArea.getChildren().removeAll();

			changeContentArea("MembersInterface");
		}
		
		if(((Control)mouseEvent.getSource()).getId().toString().equals("RoomsButton")) {
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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		contentArea.getChildren().removeAll();

		try {
			changeContentArea("widgets");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
