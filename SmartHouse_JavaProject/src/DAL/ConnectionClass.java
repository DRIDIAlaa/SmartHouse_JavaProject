package DAL;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
public static Connection connection;
    @SuppressWarnings("deprecation")
	public static Connection getConnection(){
        String dbName="smarthouse";
        String userName="root";
        String password="";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            connection= DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,userName,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

}