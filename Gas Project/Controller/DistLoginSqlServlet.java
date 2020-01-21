package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DistLoginSqlServlet
 */
@WebServlet("/DistLoginSqlServlet")
public class DistLoginSqlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DistLoginSqlServlet() {
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
		String DistName=request.getParameter("distname");
		String DistPassword=request.getParameter("password");
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gasbooking","root","gangireddy");
		Statement stmt=conn.createStatement();
		String sql="select * from distributor where Dist_Name= '"+DistName+"'and Dist_Password='"+DistPassword+"'";
		ResultSet rs=stmt.executeQuery(sql);
		if(rs.absolute(1))
		{
		response.sendRedirect("homepage.html");
		}
		else
		{
		response.sendRedirect("distlogin.html");
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


