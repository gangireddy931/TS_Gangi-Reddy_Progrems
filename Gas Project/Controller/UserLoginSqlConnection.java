package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserLoginSqlConnection
 */
@WebServlet("/UserLoginSqlConnection")
public class UserLoginSqlConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginSqlConnection() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String UserName=request.getParameter("username");
		String UserPassword=request.getParameter("password");
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gasbooking","root","gangireddy");
		Statement stmt=conn.createStatement();
		String sql="select * from user where User_Name= '"+UserName+"'and User_Password='"+UserPassword+"'";
		ResultSet rs=stmt.executeQuery(sql);
		if(rs.absolute(1))
		{
		response.sendRedirect("homepage.html");
		}
		else
		{
		response.sendRedirect("login.html");
		}
		}

		catch(ClassNotFoundException e)
		{
		}
		catch(SQLException e)
		{
		e.printStackTrace();
		}
	}

}
