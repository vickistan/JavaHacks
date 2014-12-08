// STEP 1: Import required packages
import java.sql.*;
import java.util.*;

public class SQLInsert {
// JDBC driver name and database URL
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
static final String DB_URL = "jdbc:mysql://localhost:3306/family";

// Database credentials
static final String USER = "root";
static final String PASS = "FkvtS33h";

public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    Scanner scn = new Scanner(System.in);
    String lastname = null, firstname = null, family = null, sex = null, DOB = null, DOD = null, address = null, phone = null;

    try {
        // STEP 2: Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");

        // STEP 3: Open a connection
        System.out.print("\nConnecting to database...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        System.out.println(" SUCCESS!\n");

        // STEP 4: Ask for user input
        System.out.print("Enter last name ");
        lastname = scn.nextLine();

        System.out.print("Enter first name ");
        firstname = scn.nextLine();

        System.out.print("Enter family name ");
        family = scn.nextLine();

        System.out.print("Enter M for male or F for female ");
        sex = scn.nextLine();

        System.out.print("Enter date of birth ");
        DOB = scn.nextLine();

        System.out.print("Enter date of death or NA ");
        DOD = scn.nextLine();

        System.out.print("Enter address");
        address = scn.nextLine();

        System.out.print("Enter phone");
        phone = scn.nextLine();

        // STEP 5: Excute query
        System.out.print("\nInserting records into table...");
        stmt = conn.createStatement();

        String sql = "INSERT INTO members " +
            "VALUES (lastname, firstname, family, sex, DOB, DOD, address, phone)";
        stmt.executeUpdate(sql);

        System.out.println(" SUCCESS!\n");

    } catch(SQLException se) {
        se.printStackTrace();
    } catch(Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if(stmt != null)
                conn.close();
        } catch(SQLException se) {
        }
        try {
            if(conn != null)
                conn.close();
        } catch(SQLException se) {
            se.printStackTrace();
        }
    }
    System.out.println("Thank you for your patronage!");
  }
}
