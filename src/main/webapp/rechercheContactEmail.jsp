<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search contact </title>
</head>
<form method="post" action="RechercheContactEmailServlet">
		<table>
			<tr>
				<th><h2>Reseignez vous l'email que vous voulez chercher</h2></th>
				<tr>
					<td><i>Email: <input type="text" name="email" size="25"></i></td>
				</tr>
				<tr>
					<td><input class="button" type="submit" value="Rechercher" /></td>
				</tr>
		</table>
	</form>
</html>