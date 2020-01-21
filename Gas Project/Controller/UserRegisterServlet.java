package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.UserRegisterBean;
import Dao.UserRegisterDao;


/**
 * Servlet implementation class Registration
 */
@WebServlet("/UserRegisterServlet")
public class UserRegisterServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
 

  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out=response.getWriter();
try {
System.out.println("in post");
String Name=request.getParameter("Name");

String password = request.getParameter("password");

String CPassword=request.getParameter("CPassword");
String DId=request.getParameter("DId");

  
String Address=request.getParameter("Address");
String Email=request.getParameter("Email");
String Phone=request.getParameter("Phone");

System.out.println("After");

UserRegisterBean loginBean = new UserRegisterBean();
System.out.println("Before");

loginBean.setusername(Name); //setting up the received values from index.jsp to setters and getters
loginBean.setuserPassword(password);

loginBean.setuserConfirmPassword(CPassword);
loginBean.setdistId(DId);

loginBean.setuserAddress(Address);
loginBean.setuserEmail(Email);
loginBean.setuserPhone(Phone);

//Date crDate  = Date.valueOf(createdDate);

//loginBean.setcrDate(crDate);


int checkFlag = UserRegisterDao.registerUser(loginBean); //sending all the values of pojo reference to save method in ServiceLogic
System.out.println("FLAG " + checkFlag);

if(checkFlag!=0){
//out.print("SuccessFully Registered"); // if successfully executes save method
PrintWriter out1 = response.getWriter();
out1.printf("Name",Name);
out1.printf("password", password );
out1.printf("CPassword ",CPassword);
out1.printf("DId", DId );

out1.printf("Address", Address);
out1.printf("Email",Email);
out1.printf("Phone",Phone);

}else{
request.getRequestDispatcher("homepage.html").include(request, response);

}
} catch (Exception e) { // will throw an exception if at all user typed any language constraints.
System.out.println(e.getMessage());
//out.print("<p align='center'>Please enter Valid Details</p>");
request.getRequestDispatcher("registrationgas.html").include(request, response);
}
}
}