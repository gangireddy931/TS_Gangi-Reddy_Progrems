<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta Charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

.navbar {
	overflow: hidden;
	height: 40px;
	background-color: #333;
}

.navbar a {
	float: center;
	font-size: 25px;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

.dropdown {
	float: left;
	overflow: hidden;
}

.navbar a:hover, .dropdown:hover .dropbtn {
	background-color: green;
}

.dropdown .dropbtn {
	font-size: 15px;
	border: none;
	outline: none;
	color: black;
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
}

.mySlides {
	display: none;
	margin-left: initial;
	margin-right: inherit;
	height: 400px;
}

.dropdown-content a {
	float: none;
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
	text-align: left;
}

h3 {
	color: yellow;
}
</style>
</head>
<body>
<h1 style="color:red"><marquee style="background-color:yellow" direction="right" scrollamount="6" Width="50%">WelcomeTo</marquee><marquee style="background-color:yellow" direction="left" scrollamount="6" width="50%">Bharat Gas</marquee></h1>
	<form action="BookingServlet" method="post">
		<div class="navbar" style="background-color: deeppink">
		<a class="active" href="homepage.html"><i class="fa fa-home">Home</i></a>
  
				<a href="Booking.jsp">BOOK CYLINDER </a><a href="BookingView.jsp">VIEW BOOKING </a> 
				<a href="Search.jsp">SEARCH </a>
				<a href="Logout.jsp">LOGOUT </a>
				

		</div>
		<% //HttpSession session = request.getSession(false);%>
       <h1>Welcome:<%=session.getAttribute("username")%></h1>
       		<div class="control-label col-sm-4">
			<img class="mySlides" src="3kcm2i.gif" style="width: 100%"
				height="50%" align="right">
		</div>
		<div class="control-label col-sm-8"
			style="background-color: darkorange" align="top">
			<br> <br>
			<center>
				<h3>Book Details</h3>
			</center>
			<br> <br>
			<div class="form-group">
				<div class="col-sm-offset-5 col-sm-5">
					<button type="Submit" class="btn-default"
						style="background-color: fuchsia")>Book Now</button>


				</div>
				<br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>
			</div>
		</div>
		</table>
		</div>
		</div>
	</form>
</body>
<script>
      var myIndex = 0;
      carousel();
      function carousel() {
        var i;
        var x = document.getElementsByClassName("mySlides");
        for (i = 0; i < x.length; i++) {
          x[i].style.display = "none";  
        }
        myIndex++;
        if (myIndex > x.length) {myIndex = 1}    
        x[myIndex-1].style.display = "block";  
        setTimeout(carousel, 3000); // Change image every 3 seconds
      }
   </script>
</html>