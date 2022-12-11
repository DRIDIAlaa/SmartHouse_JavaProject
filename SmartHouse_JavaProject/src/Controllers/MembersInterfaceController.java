package Controllers ;


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import BOL.Member;
import DAL.ConnectionClass;

/**
 * FXML Controller class
 *
 * @author hocin
 */
public class MembersInterfaceController implements Initializable {

    @FXML
    private TableView<Member> MembersTable;
    @FXML
    private TableColumn<Member, String> name;
    @FXML
    private TableColumn<Member, String> room;
    @FXML
    private TableColumn<Member, String> checkin;
    @FXML
    private TableColumn<Member, String> checkout;
    
    
    String query = null;
    Connection connection = null ;
    PreparedStatement preparedStatement = null ;
    ResultSet resultSet = null ;
    Member member = null ;
    
    ObservableList<Member>  membersList = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	refreshTable();
        name.setCellValueFactory(new PropertyValueFactory<Member, String>("name"));
        room.setCellValueFactory(new PropertyValueFactory<Member, String>("room"));
        checkin.setCellValueFactory(new PropertyValueFactory<Member, String>("checkin"));
        checkout.setCellValueFactory(new PropertyValueFactory<Member, String>("checkout"));
        MembersTable.setItems(membersList);
    }    

	@FXML
    private void close(MouseEvent event) {
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    public void addMemberButtonAction(ActionEvent actionEvent) throws IOException, InterruptedException {
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(getClass().getResource("/FXML/AddMemberDialog.fxml"));
		//Pane dialogPane = fxmlLoader.load();
		Parent root = fxmlLoader.load();    
		Scene scene = new Scene(root, 700, 250);
	        Stage stage = new Stage();
	        stage.initModality(Modality.APPLICATION_MODAL);
	        stage.setScene(scene);
	        stage.show();
	}

    public void refreshTable() {
    	this.connection = ConnectionClass.getConnection();
    	try {
            membersList.clear();
            
            query = "SELECT * FROM `user`";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()){
                membersList.add(new  Member(
                        resultSet.getString("name").toString(),
                        resultSet.getString("Room").toString(),
                        resultSet.getString("Checkin").toString(),
                        resultSet.getString("checkout").toString()));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(MembersInterfaceController.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
 }

