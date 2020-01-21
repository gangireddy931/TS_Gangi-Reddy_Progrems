package Dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Bean.UserRegisterBean;
import Dbconnection.UserRegisterDb;
 
public class UserRegisterDao {
 
 public static int registerUser(UserRegisterBean loginBean)
 {
 
	 try {
		 Connection con=UserRegisterDb.getConnection(); //getting the connection method here from dbconnection
		 PreparedStatement ps = con.prepareStatement("insert into User(User_Name,User_password,User_Confirm_Password,Dist_Id,User_Address,User_Email,User_Phone) values(?,?,?,?,?,?,?)");
		 ps.setString(1, loginBean.getusername());//sending up the values received from user to the database table
		 ps.setString(2, loginBean.getuserPassword());
		 ps.setString(3,loginBean.getuserconfirmPassword());
		 ps.setString(4, loginBean.getdistId());
		 
		 ps.setString(5, loginBean.getuserAddress());
		 ps.setString(6, loginBean.getuserEmail());
		 ps.setString(7, loginBean.getuserPhone());
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
