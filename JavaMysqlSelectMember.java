import java.sql.*;
 
/**
 * A Java MySQL SELECT statement example.
 * Demonstrates the use of a SQL SELECT statement against a
 * MySQL database, called from a Java program.
 * 
 */
public class JavaMysqlSelectMember
{
 
  public static void main(String[] args)
  {
    try
    {
      // create our mysql database connection
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost/family?zeroDateTimeBehavior=convertToNull";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "Passw0rd1");
       
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "SELECT * FROM members";
 
      // create the java statement
      Statement st = conn.createStatement();
       
      // execute the query, and get a java resultset
      ResultSet rs = st.executeQuery(query);
       
      // iterate through the java resultset
      while (rs.next())
      {
        int id = rs.getInt("id");
        String lastName = rs.getString("lastname");
        String firstName = rs.getString("firstname");
        String family = rs.getString("family");
        String sex = rs.getString("sex");
	SimpleDateFormat sdf = new SimpleDateFormat("dd Mon YYYY");
#SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateofbirth = rs.getDate("DOB");
        Date dateofdeath = rs.getDate("DOD");
        String address = rs.getString("address");
        String phone = rs.getString("phone");
         
        // print the results
        System.out.format("%s, %s, %s, %s, %s, %s, %s, %s %s\n", id, lastName, firstName, family, sex, sdf.format(new Date(dateofbirth)), sdf.format(new Date(dateofdeath)), address, phone);
      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
  }
}
