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
	/*public static void showMember() throws SQLException {
		
		try {
		ConnectionClass connectionClass=new ConnectionClass();
	    Connection connection=connectionClass.getConnection();
	    
	    String query = "SELECT * FROM user";
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    while (rs.next())
	      {
	        String name = rs.getString("name");
	        String room = rs.getString("room");
	        String checkin = rs.getString("checkin");
	        String checkout = rs.getString("checkout");

	        
	        // print the results
	        System.out.format("%s, %s, %s, %s",name,room,checkin,checkout);
	      }
	      st.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	  }*/
	}
	





//	    String sql="INSERT INTO USER VALUES ('"+name+"')";

//INSERT INTO `user` (`name`, `ROOM`, `Check-in`, `check-out`) VALUES ('"+name+ROOM+Checkin+Checkout+"');