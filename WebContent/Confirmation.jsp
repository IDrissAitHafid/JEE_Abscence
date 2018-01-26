<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Abscence</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
</head>
<body>
<%@include file="header.jsp" %>
<div class="container col-md-4 col-md-offset-4 ">
<div class="panel panel-danger">
  <div class="panel-heading">Confirmation</div>
  <div class="panel-body">
     <div class="form-group">
       <label>ID Professeur:</label>
       <label>${professeur.id_professeur}</label>
     </div>
     <div class="form-group">
       <label>Nom Professeur:</label>
       <label>${professeur.nom_professeur}</label>
     </div>
     <div class="form-group">
       <label>Prénom Professeur:</label>
       <label>${professeur.prenom_professeur}</label>
     </div>
     <div class="form-group">
       <label>Email:</label>
       <label>${professeur.email}</label>
     </div>
     <div class="form-group">
       <label>Numéro de Téléphone:</label>
       <label>${professeur.numero_Telephone}</label>
     </div>
     
    
  </div>
</div>
</div>
</body>
</html>