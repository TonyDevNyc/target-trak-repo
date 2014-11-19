<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Target-Trak Login</title>
	<link rel="stylesheet" type="text/css" href="/target-trak-web/resources/css/login.css">
	<link rel="stylesheet" type="text/css" href="/target-trak-web/resources/css/input.css">
</head>
<body>
	<div class="container">
		<div class="login">
			<h1>Welcome to Target-Trak</h1>
			<form method="POST" action="/target-trak-web/j_spring_security_check">
				<p>
					<input type="text" name="j_username" value="" placeholder="Username">
				</p>
				<p>
					<input type="password" name="j_password" value="" placeholder="Password">
				</p>
				<p class="remember_me">
					<label> 
						<label> 
							<input type="checkbox" name="remember_me" id="remember_me"> Remember me
						</label>
					</label>
				</p>
				<p class="submit">
					<input type="submit" name="commit" value="Login">
				</p>
			</form>
		</div>

		<div class="login-help">
			<p>
				Forgot your password? <a href="#">Click here to reset it</a>.
			</p>
		</div>
	</div>
</body>
</html>

