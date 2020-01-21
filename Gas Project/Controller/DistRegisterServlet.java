package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.DistRegisterBean;
import Dao.DistRegisterDao;


/**
 * Servlet implementation class DistRegisterServlet
 */
@WebServlet("/DistRegisterServlet")
public class DistRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DistRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try {
		System.out.println("in post");
		String DId=request.getParameter("DId");
		String dName=request.getParameter("dName");

		String dpassword = request.getParameter("dpassword");

		String dCPassword=request.getParameter("dCPassword");
		

		 
		String dAddress=request.getParameter("dAddress");
		String dPhone=request.getParameter("dPhone");
		String dEmail=request.getParameter("dEmail");
		

		System.out.println("After");

		DistRegisterBean loginBean = new DistRegisterBean();
		System.out.println("Before");
		loginBean.setdistId(DId);//setting up the received values from index.jsp to setters and getters
		loginBean.setdistname(dName); 
		loginBean.setdistPassword(dpassword);

		loginBean.setdistConfirmPassword(dCPassword);
	
	
		loginBean.setdistAddress(dAddress);
		loginBean.setdistPhone(dPhone);
		loginBean.setdistEmail(dEmail);
		

		//Date crDate  = Date.valueOf(createdDate);

		//loginBean.setcrDate(crDate);
		int checkFlag = DistRegisterDao.registerDist(loginBean); //sending all the values of pojo reference to save method in ServiceLogic
		System.out.println("FLAG " + checkFlag);

		if(checkFlag!=0){
		out.print("SuccessFully Registered"); // if successfully executes save method
		PrintWriter out1 = response.getWriter();
		out1.printf("DId", DId );
		out1.printf("dName ",dName);
		out1.printf("dpassword", dpassword );
		out1.printf("dCPassword ",dCPassword);
	
		
		out1.printf("dAddress", dAddress);
		out1.printf("dPhone",dPhone);
		out1.printf("dEmail",dEmail);
		
		
		}else{
		request.getRequestDispatcher("homepage.html").include(request, response);

		}
		} catch (Exception e) { // will throw an exception if at all user typed any language constraints.
		System.out.println(e.getMessage());
		//out.print("<p align='center'>Please enter Valid Details</p>");
		request.getRequestDispatcher("distregistration.html").include(request, response);
		}
		}
		
	}


