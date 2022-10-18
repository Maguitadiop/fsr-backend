<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<meta charset="ISO-8859-1">
<title>Search contact </title>
</head>
 <div class="container">
    <div class="row">
      <div class="col-md-12">
        <div class="card bg-dark my-5">
          <div class="card-body">
            <h2 class="card-title text-center text-white py-3"> Rechercher par Firstname</h2>
          </div>
        </div>
      </div>
    </div>
  </div>
<form method="post" action="RechercheContactFNameServlet">
		<table>
			<tr>
				<th><h2>Reseignez vous firstnamer</h2></th>
				<tr>
					<td><i>Firstname: <input type="text" name="fname" size="25"></i></td>
				</tr>
				<tr>
					<td><input class="button" type="submit" value="Rechercher" /></td>
				</tr>
		</table>
	</form>
</html>