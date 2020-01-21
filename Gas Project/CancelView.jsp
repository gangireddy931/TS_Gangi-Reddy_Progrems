<%@page import="java.util.Base64"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.servlet.http.HttpSession"%>
<%! String driver = "com.mysql.cj.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/gasbooking";%>
<%!String username = "root";%>
<%!String password ="gangireddy" ;%>

<%
   try {
   Class.forName(driver);
   } catch (ClassNotFoundException e) {
   e.printStackTrace();
   }
   Connection connection = null;
   Statement statement = null;
   ResultSet resultSet = null;
  
   %>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<style>
.dropdown {
	float: left;
	overflow: hidden;
}

.dropdown .dropbtn {
	font-size: 30px;
	border: none;
	outline: none;
	color: white;
	padding: 14px 16px;
	background-color: inherit;
	font-family: inherit;
	margin: 0;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: #f9f9f9;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.box {
	width: 700px;
	height: 70px;
	padding: 20px;
	margin: 100px auto;
	margin-top: auto;
	background-position: center;
	box-shadow: 0px grey;
	border: 10px;
	background-image: url(image5.jpg);
	background-image: url(image6.jpg);
}

.mySlides {
	display: none;
	margin-left: initial;
	margin-right: inherit;
	height: 500px;
}

.dropdown-content a {
	float: none;
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
	text-align: left;
}

.dropdown:hover .dropdown-content {
	display: block;
}
</style>
</head>
<body style="background-color: orange">
	<% HttpSession s = request.getSession(false);%>
	<h1>
		 <h1>Welcome:<%=session.getAttribute("username")%></h1>
	<div class="container">

		<div class="column">
			<div class="control-label col-sm-6" >
				<br></br>
				<table border="1">
					<tr>

						<td>
							<h4>Booking Id</h4>
						</td>

						<td>
							<h4>User Id</h>
						</td>
						<td>
							<h4>Booking Date</h4>
						</td>
						<td>
							<h4>Delivery Date</h4>
						</td>
						<td>
							<h4>Status</h4>
						</td>

					</tr>

					<%
            try{
            connection = DriverManager.getConnection(url,username,password);
            statement=connection.createStatement();
          //  Object num= new Object ();
            //  num= s.getAttribute("userId");
              String mysql ="select * from booking where User_Id="+session.getAttribute("userid") ;
            System.out.println("Sql is  " +mysql);
            resultSet = statement.executeQuery(mysql);
            while(resultSet.next()){
                %>
					<tr> 
						<td><%=resultSet.getInt("Booking_Id") %></td>
				       <td><%=resultSet.getInt("User_Id") %></td>
						<td><%=resultSet.getDate("book_date") %></td>
						<td><%=resultSet.getDate("Delivery_Date") %></td>
						<td><%=resultSet.getString("Book_Status") %></td>
					</tr>
					<%
           }
            connection.close();
            } catch (Exception e) {
            e.printStackTrace();
            }
            %>
				</table>
				<br> <br> <br>
				
					<a href="Payment.html"><button type="Submit"
							class="btn-default" style="background-color: fuchsia">Payment</button></a>
					<a href="Booking.jsp"><button type="Submit"
							class="btn-default" style="background-color: fuchsia">Ok</button></a>
			
			</div>
		</div>
	</div>
	
</body>
</html>