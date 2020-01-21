package Dao;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

import Bean.DistRegisterBean;
import Dbconnection.DistRegisterDb;

	 
	public class DistRegisterDao {
	 
	 public static int registerDist(DistRegisterBean loginBean)
	 {
	 
		 try {
			 Connection con=DistRegisterDb.getConnection(); //getting the connection method here from dbconnection
			 PreparedStatement ps = con.prepareStatement("insert into distributor values(?,?,?,?,?,?,?)");
			 ps.setString(1, loginBean.getdistId());//sending up the values received from user to the database table
			 ps.setString(2, loginBean.getdistname());
			 ps.setString(3, loginBean.getdistPassword());
			 ps.setString(4,loginBean.getdistconfirmPassword());
			
		
			 ps.setString(5, loginBean.getdistAddress());
			
			 ps.setString(6, loginBean.getdistPhone());
			 ps.setString(7, loginBean.getdistEmail());
			 int flag=ps.executeUpdate(); //value changes if it is executed
			 if(flag!=0)
			 {
			 System.out.println("inserted");
			 }
			 con.close();
			 } catch (SQLException e ) {

			 System.out.println(e.getMessage());
			 }
			 return 0;

	 }


			 

}
