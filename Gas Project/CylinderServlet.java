

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CylinderServlet
 */
@WebServlet("/CylinderServlet")
public class CylinderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CylinderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try {
			System.out.println("in try");
			Class.forName("com.mysql.cj.jdbc.Driver");
			java.sql.Connection cn;
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gasbooking","root","gangireddy");
			Statement st = cn.createStatement();
			System.out.println("connection established successfully...!!");

			ResultSet rs = st.executeQuery("Select * from cylinder");

			out.println("<table border=1>");
			while (rs.next()) {
				out.println("<tr><td>" + rs.getInt("PRICE") + "</td></tr>");
			}
			out.println("</table>");
			out.close();
			out.print("<html><body><b>Successfully displayed" + "</b></body></html>");
		} catch (Exception e) {
			e.printStackTrace();
		}
			

	}

}
