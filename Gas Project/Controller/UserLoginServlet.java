package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dbconnection.UserRegisterDb;

/**
 * Servlet implementation class Login
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int username;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserLoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
	//	HttpSession session = request.getSession(false);
		try {
			Connection con = UserRegisterDb.getConnection();
			java.sql.Statement st = con.createStatement();
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
		System.out.println("hii");
			String sql="select * from user where User_Name= '"+username+"'and User_password='"+password+"'";
			ResultSet rs=st.executeQuery(sql);		 	
			if(rs.absolute(1))
			{
				System.out.print("Inside login success-"+rs.getString("User_Id"));
				// Set userid and username in session for the further communication
				session.setAttribute("userid", rs.getString("User_Id"));

				session.setAttribute("username", rs.getString("User_Name"));
				//request.setAttribute("");
				response.sendRedirect("Booking.jsp");
			}
			else 
			{
				response.sendRedirect("login.html");
			}
			
		 


			

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
