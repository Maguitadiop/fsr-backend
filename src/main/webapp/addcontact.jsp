<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<form method="post" action="AddContactServlet">

  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">FirstName</label>
      <input type="text" class="form-control" name ="fname" id="inputFirstName" placeholder="FirstName">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">LastName</label>
      <input type="text" class="form-control" name ="lname"id="inputLastName" placeholder="LastName">
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress">Email</label>
    <input type="text" class="form-control" name = "email" id="inputEmail" placeholder="exemple@tls">
  </div>
  <div class="form-row">
  <div class="form-group col-md-6">
      <label for="inputCity">Street</label>
      <input type="text" class="form-control" name ="street" id="inputStreet">
    </div>
    <div class="form-group col-md-6">
      <label for="inputCity">City</label>
      <input type="text" class="form-control" name ="city" id="inputCity">
    </div>
    <div class="form-group col-md-4">
      <label for="inputState">State</label>
      <select id="inputState" class="form-control" name ="country">
        <option selected>Choose...</option>
        <option>France</option>
        <option>UK</option>
        <option>USA</option>
      </select>
    </div>
    <div class="form-group col-md-2">
      <label for="inputZip">Zip</label>
      <input type="text" class="form-control" name ="zip" id="inputZip">
    </div>
  </div>
  <div class="form-row">
  <div class="form-group col-md-6">
      <label for="inputCity">Phone Number</label>
      <input type="text" class="form-control" name ="phoneNum" id="inputPhoneNum">
    </div>
    <div class="form-group col-md-6">
      <label for="inputCity">Phone Kind</label>
      <input type="text" class="form-control" name ="phoneKind" id="inputPhoneKind	">
    </div>
   </div>
  <div class="form-group">
    <label for="inputAddress">Contact Group</label>
    <input type="text" class="form-control" name = "group" id="inputGroup" placeholder="Travail...">
  </div>
  
  <button type="submit" class="btn btn-primary">Add Contact</button>
</form>
</html>