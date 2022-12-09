package Controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Random;

import BOL.MachineState;
import BOL.Room;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;

public class RoomsInterfaceController implements Initializable{
	@FXML 
	private StackPane contentArea;
	@FXML
	private TableView<Room> roomTable;
	@FXML 
	private TableColumn <Room, Integer> roomId;
	@FXML 
	private TableColumn <Room, String> roomName;
	@FXML 
	private TableColumn <Room, String> roomOwner;
	@FXML 
	private TableColumn <Room, Integer> temprature;
	@FXML 
	private TableColumn <Room, MachineState> heaterState;
	private int t;
	
	private ObservableList<Room> roomsList = FXCollections.observableArrayList(
		new Room(1, "Bed room", "Achraf",t = new Random().nextInt(35), heaterSatate(t)),
		new Room(2, "Bed room", "Alaa",t = new Random().nextInt(35), heaterSatate(t)),
		new Room(3, "Kitchen", "Commun",t = new Random().nextInt(35), heaterSatate(t)),
		new Room(4, "Living room", "Commun",t = new Random().nextInt(35), heaterSatate(t))
		);
	//a method that returns on if the heater is terned on else it's off
	private MachineState heaterSatate(int n) {
		if(n<15) {
			return MachineState.On;
		}else {
			return MachineState.Off;
		}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		roomId.setCellValueFactory(new PropertyValueFactory<Room, Integer>("roomId"));
		roomName.setCellValueFactory(new PropertyValueFactory<Room, String>("roomName"));
		roomOwner.setCellValueFactory(new PropertyValueFactory<Room, String>("roomOwner"));
		temprature.setCellValueFactory(new PropertyValueFactory<Room, Integer>("temprature"));
		heaterState.setCellValueFactory(new PropertyValueFactory<Room, MachineState>("heaterState"));
		roomTable.setItems(roomsList);
		
	}
}
