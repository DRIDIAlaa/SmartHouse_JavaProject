package DAL;

public class AccessMember {
    String sql = "SELECT id, username FROM users WHERE id = ?";
    /*String url = "";
    try (Connection conn = DriverManager.getConnection(url);
      Statement stmt = conn.createStatement()) {

      try {
        ResultSet rs = stmt.executeQuery("select * from albums";);
        while (rs.next()) {
          String name = rs.getString("title");
          System.out.println(name);
        }
      } catch (SQLException e ) {
            throw new Error("Problem", e);
      } 

    } catch (SQLException e) {
      throw new Error("Problem", e);
    } */

}
