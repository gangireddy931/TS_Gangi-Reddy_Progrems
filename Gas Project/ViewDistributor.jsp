<%@page import="java.util.Base64"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<%@ page import = "javax.servlet.http.HttpSession"%>
<%! String driver = "com.mysql.cj.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/gasbooking";%>
<%!String username = "root";%>
<%!String password = "gangireddy";%>

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
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
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
	<div class="container">

		<div class="column">
			<div class="control-label col-sm-12" align="top">
				<br></br>
				<table border="1">
					<tr>

						<td>
							<h2>Dist Id</h2>
						</td>

						<td>
						
								<h2>Dist Name</h2>
						</td>
						<td>
							<h2>DistAddress</h2>
						</td>
						<td>
							<h2>Dist Phone</h2>
						</td>
						<td>
							<h2>Dist Email</h2>
						</td>

					</tr>
				
					<%
            try{
            connection = DriverManager.getConnection(url,username,password);
            statement=connection.createStatement();
           String Dist_Address= request.getParameter("district");
            String mysql ="select * from distributor where Dist_Address like '%"+Dist_Address+"%' " ;
            System.out.println("Sql is  " +mysql);
            resultSet = statement.executeQuery(mysql);
            while(resultSet.next()){
                 %>
					<tr> 

						<td><%=resultSet.getInt("Dist_Id") %></td>
				        <td><%=resultSet.getString("Dist_Name") %></td>
						<td><%=resultSet.getString("Dist_Address") %></td>
						<td><%=resultSet.getString("Dist_Phone") %></td>
						<td><%=resultSet.getString("Dist_Email") %></td>
					</tr>
					<%
            }
            connection.close();
            } catch (Exception e) {
            e.printStackTrace();
            }
            %>
				</table>
				<br>
				<br>
				<br>
				
		<center>	<a href="Logout.jsp" ><button type="Submit" class="btn-default"
						style="background-color: fuchsia">Logout</button></a></center>
						</div></div></div>
</body>
</html>