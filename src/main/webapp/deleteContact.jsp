<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete contact</title>
</head>
<form method="get" action="DeleteContactServlet">
		<table>
			<tr>
				<th><h2>Reseignez l'id</h2></th>
				<tr>
					<td><input type="hidden" name="action" value="delete"/></td>
				</tr>
				<tr>
					<td><i>id: <input type="text" name="id" size="25"></i></td>
				</tr>
				
				
				<tr>
					<td><input class="button" type="submit" value="Supprimer" /></td>
				</tr>
		</table>
	</form>
</html>