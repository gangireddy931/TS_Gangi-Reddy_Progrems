

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServletConn
 */
@WebServlet("/UserServletConn")
public class UserServletConn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServletConn() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String User_Name = request.getParameter("Name");
		String User_password = request.getParameter("password");
		String User_Confirm_Password = request.getParameter("CPassword");
		String Dist_Id = request.getParameter("DId");
		String User_Id = request.getParameter("UId");
		String  User_Address= request.getParameter("Address");
		String User_Email = request.getParameter("Email");
		String User_Phone = request.getParameter("Phone");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gasbooking","root","gangireddy");
			PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?,?,?,?,?)");
			ps.setString(1, User_Name);
			ps.setString(2, User_password);
			ps.setString(3, User_Confirm_Password);
			ps.setString(4, Dist_Id);
			ps.setString(5, User_Id);
			ps.setString(6, User_Address);
			ps.setString(7, User_Email);
			ps.setString(8, User_Phone);
			ps.execute();
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	}


