<html>
<head>
	<title>hello springboot</title>
</head>
<body>
	用户列表：<br>
	<table border="1">
		<tr>
			<td>id</td>
			<td>username</td>
			<td>password</td>
			<td>phone</td>
			<td>email</td>
			<td>created</td>
			<td>updated</td>
		</tr>
		<#list userList as user>
		<tr>
			<td>${user.id}</td>
			<td>${user.username}</td>
			<td>${user.password}</td>
			<td>${user.phone!}</td>
			<td>${user.email!}</td>
			<td>${user.created?date}</td>
			<td>${user.updated?date}</td>
		</tr>
		</#list>
	</table>
</body>
</html>
