package BOL;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Room {
	public Room(int roomId, String roomName, String roomOwner, Integer temprature, MachineState heaterState) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
		this.roomOwner = roomOwner;
		this.temprature = temprature;
		this.heaterState = heaterState;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomOwner() {
		return roomOwner;
	}
	public void setRoomOwner(String roomOwner) {
		this.roomOwner = roomOwner;
	}
	public Integer getTemprature() {
		return temprature;
	}
	public void setTemprature(Integer temprature) {
		this.temprature = temprature;
	}
	public MachineState isHeaterState() {
		return heaterState;
	}
	public void setHeaterState(MachineState heaterState) {
		this.heaterState = heaterState;
	}
	private int roomId;
	private String roomName;
	private String roomOwner;
	private Integer temprature;
	private MachineState heaterState; //true for on false for off
	
}

