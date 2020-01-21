package Dbconnection;


	import java.sql.Connection;
	import java.sql.DriverManager;

	public class DistRegisterDb {
	public static Connection getConnection(){ //making a static connection,shares to all classes
	Connection con=null; // creating connection
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gasbooking","root","gangireddy");

	} catch (Exception e) {
	//throws an error if at all its unable to create an connection
	System.out.println("unable to connect to the database");
	}
	return con; // we return the connection and we can get the connection wherever needed.
	}

	}
