<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
	font-size: 40px;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

.dropdown {
	float: left;
	overflow: hidden;
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
	height: 675px;
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
	<form action="" method="post">
		<div class="navbar" style="background-color: deeppink">
			<center>
				<a href="#Bill">Billing </a>
			</center>
		</div>
		<div class="control-label col-sm-12"
			style="background-color: darkorange" >
			<br> <br>
			<center>
				<h3>Bill Details</h3>
			</center>
			<br> <br>
			<div class="control-label col-sm-10">
				<table id="Billform" cellspacing=20 cellpadding=20>
					<div class="form-vertical">
						<div class="form-group">
							<label class="control-label col-sm-5" for="BillNo">
								BillNo:</label>
							<div class="col-sm-5">
								<left> <input type="Number" class="form-control"
									id="BillNo" placeholder="BillNo" name="BillNo">
							</div>
							<br>
						</div>
						<br>
						<div class="form-group">
							<label class="control-label col-sm-5" for="number">Consumer
								Id:</label>
							<div class="col-sm-5">
								<input type="number" class="form-control" id="number"
									placeholder="Consumer Number" name="ConsumerNumber">
							</div>
							<br>
						</div>
						<br>
						<div class="form-group">
							<label class="control-label col-sm-5" for="Delivery">Delivery
								Date:</label>
							<div class="col-sm-5">
								<input type="datetime-local" class="form-control" id="address"
									placeholder="Date" name="DeliveryDate">
							</div>
							<br>
						</div>
						<br>
						<div class="form-group">
							<label class="control-label col-sm-5" for="price">Price:</label>
							<div class="col-sm-5">
								<input type="number" class="form-control" placeholder="Price"
									name="Price">
							</div>
							<br>
						</div>
						<br>
						<div class="form-group">
							<label class="control-label col-sm-5" for="tax">Tax:</label>
							<div class="col-sm-5">
								<input type="number" class="form-control" placeholder="Tax"
									name="Tax">
							</div>
							<br>
						</div>
						<br>
						<div class="form-group">
							<label class="control-label col-sm-5" for="tax">Total
								Amount:</label>
							<div class="col-sm-5">
								<input type="number" class="form-control" placeholder="Amount"
									name="TotalAmount">
							</div>
							<br>
						</div>
						<br>
						<div class="form-group">
							<div class="col-sm-offset-5 col-sm-5">
								<button type="Submit" class="btn-default"
									style="background-color: fuchsia">Print</button>

								<button type="Submit" class="btn-default"
									style="background-color: fuchsia">Cancel</button>
							</div>
							<br> <br> <br> <br> <br> <br> <br>
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
		if (myIndex > x.length) {
			myIndex = 1
		}
		x[myIndex - 1].style.display = "block";
		setTimeout(carousel, 3000); // Change image every 3 seconds
	}
</script>
</html>