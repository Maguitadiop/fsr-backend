<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<form method="post" action="AddAdresseServlet">
		<table>
			<tr>
				<th><h2>Ajouter une adresse</h2></th>
				<tr>
					<td><i>Street: <input type="text" name="street" size="25"></i></td>
				</tr>
				<tr>
					<td><i>Country: <input type="text" name="country" size="25"></i></td>
				</tr>
				<tr>
					<td><i>City: <input type="text" name="city" size="25"></i></td>
				</tr>
					<tr>
					<td><i>Zip: <input type="text" name="zip" size="25"></i></td>
				</tr>
				<tr>
					<td><input class="button" type="submit" value="Submit" /><input class="button" type="reset" value="Reset"></td>
				</tr>
			
		</table>
	</form>
</html>