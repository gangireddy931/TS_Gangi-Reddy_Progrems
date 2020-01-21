

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewDistributorServlet
 */
@WebServlet("/ViewDistributorServlet")
public class ViewDistributorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewDistributorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			System.out.println("in");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn;
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gasbooking","root","gangireddy");
			System.out.println("connection");
			java.sql.Statement st = cn.createStatement();
			String DistributorName=request.getParameter("Dist_Name");
			String Area=request.getParameter("AREA");
			String sql ="select * from Distributor where Dist_Name like '%" +DistributorName+ "%' and AREA like '%"+Area+"%'";
			ResultSet Rs = st.executeQuery(sql);
			System.out.println("query");
			while(Rs.next()) {
				Rs.getString(2); 
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

	

}
