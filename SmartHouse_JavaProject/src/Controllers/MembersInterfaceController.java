package Controllers ;


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Observable;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;
import BOL.Member;

/**
 * FXML Controller class
 *
 * @author hocin
 */
public class MembersInterfaceController implements Initializable {

    @FXML
    private TableView<Member> MembersTable;
    @FXML
    private TableColumn<Member, String> nameCol;
    @FXML
    private TableColumn<Member, String> roomCol;
    @FXML
    private TableColumn<Member, String> checkinCol;
    @FXML
    private TableColumn<Member, String> checkoutCol;
    
    
    String query = null;
    Connection connection = null ;
    PreparedStatement preparedStatement = null ;
    ResultSet resultSet = null ;
    Member member = null ;
    
    ObservableList<Member>  MembersList = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        loadDate();
    }    
    
    
    

    private void loadDate() {
		// TODO Auto-generated method stub
		
	}




	@FXML
    private void close(MouseEvent event) {
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    private void getAddView(MouseEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/FXML/AddMemberDialog.fxml"));
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initStyle(StageStyle.UTILITY);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(MembersInterfaceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    public void refreshTable() {
        try {
            MembersList.clear();
            
            query = "SELECT * FROM `user`";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()){
                MembersList.add(new  Member(
                        resultSet.getString("name"),
                        resultSet.getString("Room"),
                        resultSet.getString("Checkin"),
                        resultSet.getString("checkout")));
                MembersTable.setItems(MembersList);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MembersInterfaceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }}

