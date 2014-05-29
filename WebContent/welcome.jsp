<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Facebook Login Using Java Servlets</title>
	

</head>
<body>
	<div class="container">
		<h1>Facebook Login Using Java Servlets</h1>
		
		<div id="auth-status">
			<div id="auth-loggedin" style="width:250px; margin:0px auto;">
				<div id="auth-display-name">${fbUser.name}</div><br/><br/>
				<div id="auth-info">
					<br/><br/>
					<b>Id: </b>${fbUser.id}<br/>
					<b>Full Name: </b>${fbUser.name}<br/>
					<b>Email: </b>${fbUser.email}<br/>
					<b>First Name: </b>${fbUser.firstName}<br/>
					<b>Last Name: </b>${fbUser.lastName}<br/>
					<b>Birthday: </b>${fbUser.birthday}<br/>			
					<br/><br/>					
				</div>
				<br/>
				<a href="./logout">
					<div id="logout">
						Logout
					</div>
				</a>				
			</div>
		</div>
	</div>
</body>
</html>