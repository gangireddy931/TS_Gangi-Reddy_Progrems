
import java.io.IOException;
import java.util.Calendar;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BookingServlet
 */
@WebServlet("/BookingServlet")
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      public  String Booking_Id;
      public String username;
      public int User_Id;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookingServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			java.sql.Connection cn;
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gasbooking","root","gangireddy");
			System.out.println("in try");
			long milliseconds = System.currentTimeMillis();
			java.sql.Date date = new java.sql.Date(milliseconds);
			System.out.println(date);

			System.out.println("new...");
			Calendar calender = Calendar.getInstance();
			calender.setTime(date);
			calender.add(Calendar.DATE, 5);
			java.sql.Date dates = new java.sql.Date(calender.getTimeInMillis());
			
			
			System.out.println(" after 5 days" + dates);
			HttpSession session = request.getSession(false);
			System.out.println("after session");
			username =(String) session.getAttribute("username");
			Statement s = cn.createStatement();
			String sql = "select user_id from user where user_name like  '" + username + "'" ; 
			ResultSet rs = s.executeQuery(sql);
			System.out.println(sql);
			System.out.println("after UserId");
			System.out.println("in username new " + username);
			rs.absolute(1);
			int User_Id = rs.getInt(1);
			System.out.println("in user id " + User_Id);
			PreparedStatement st = cn.prepareStatement("insert into Booking"
					+ "(User_Id,Book_Date,Delivery_Date,Book_Status) values(?,?,?,?)");
		    st.setInt(1,User_Id);
			st.setDate(2, date);
			st.setDate(3, dates);
			st.setString(4, "B");
			int i = st.executeUpdate();
			if (i != 0) {
				System.out.println("done");	
				response.sendRedirect("BookingView.jsp");
			
				
			}
			else
				System.out.println("not done"); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
