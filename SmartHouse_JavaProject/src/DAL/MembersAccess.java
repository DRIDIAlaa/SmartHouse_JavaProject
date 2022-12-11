package DAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MembersAccess {
	public static void addMember(String name, String room , String checkin , String checkout ) throws SQLException {
		ConnectionClass connectionClass=new ConnectionClass();
	    Connection connection=connectionClass.getConnection();
	    
	    String sql="INSERT INTO `user` (`name`, `Room`, `Checkin`, `checkout`) VALUES ('"+name+"', '"+room+"', '"+checkin+"', '"+checkout+"')";
	    Statement statement= connection.createStatement();
	    statement.executeUpdate(sql) ;
	}
}
	





//	    String sql="INSERT INTO USER VALUES ('"+name+"')";

//INSERT INTO `user` (`name`, `ROOM`, `Check-in`, `check-out`) VALUES ('"+name+ROOM+Checkin+Checkout+"');