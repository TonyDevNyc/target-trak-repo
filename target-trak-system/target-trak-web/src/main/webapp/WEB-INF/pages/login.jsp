<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DDRM Login</title>
</head>
<body>
	<div style="width: 500px; margin: 200px auto 0 auto;">
		<table border="0" align="center" cellpadding="0" cellspacing="0" width="300">
			<tr>
			    <td>
			        <form method="POST" action="/target-trak-web/j_spring_security_check">
			            <table width="100%" cellpadding="7" cellspacing="0" border="0">
			                <tr>
				                <td width="40%">Username:</td>
				                <td width="60%"><input type="text" name="j_username" /></td>
			                </tr>
			                <tr>
				                <td width="40%">Password:</td>
				                <td width="60%"><input type="password" name="j_password" /></td>
			                </tr>
			                
			                <tr>
			                	<td colspan="2"><center><input type="submit" name="Logon" /></center><br /></td>
			                </tr>
			            </table>
			        </form>
			    </td>
			</tr>
		</table>
	</div>
</body>
</html>

