

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CancelBooking
 */
@WebServlet("/CancelBooking")
public class CancelBooking extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int Booking_Id;
	private int User_Id;
	private Date book_date;
	private Date Delivery_Date;
     //private String C;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CancelBooking() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession(false);

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			java.sql.Connection cn;
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gasbooking","root","gangireddy");
			System.out.println("in try");
			//HttpSession s = request.getSession(false);
			//User_Id = request.getParameter("User_Id");
			//System.out.println(User_Id);
			PreparedStatement ps = cn.prepareStatement("Update Booking set book_date=?,Delivery_Date=?,Book_Status=? ");
			

			//ps.setInt(1,User_Id);
			ps.setDate(1,book_date);
			ps.setDate(2,Delivery_Date);
			ps.setString(3,"C");
			int i = ps.executeUpdate();
			if (i != 0) {
				response.sendRedirect("CancelView.jsp");
			}
			pw.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
