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
<title>Insert title here</title>
</head>
<body>

 <div class="container">
    <div class="row">
      <div class="col-md-12">
        <div class="card bg-dark my-5">
          <div class="card-body">
            <h2 class="card-title text-center text-white py-3">Rechercher un contact par son Id/firstname/lastname/email</h2>
            <ul class="text-center list-inline py-3">
              <li class="list-inline-item"><a href="rechercheContact.jsp" class="btn btn-info"> Rechercher par id</a></li>
               <li class="list-inline-item"><a href="rechercheContactFName.jsp" class="btn btn-info"> Rechercher par firstname</a></li>
              <li class="list-inline-item"><a href="rechercheContactLName.jsp" class="btn btn-info"> Rechercher par lastname</a></li>
              <li class="list-inline-item"><a href="rechercheContactEmail.jsp" class="btn btn-info"> Rechercher par email</a></li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>