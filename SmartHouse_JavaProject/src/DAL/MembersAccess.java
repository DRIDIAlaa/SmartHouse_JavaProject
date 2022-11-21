package DAL;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MembersAccess {
	public static void addMember(String name) throws SQLException {
		ConnectionClass connectionClass=new ConnectionClass();
	    Connection connection=connectionClass.getConnection();
	    
	    String sql="INSERT INTO USERS VALUES ('"+name+"')";
	    Statement statement= connection.createStatement();
	    statement.executeUpdate(sql) ;
	}
}
