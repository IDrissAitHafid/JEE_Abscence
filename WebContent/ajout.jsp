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
  <div class="panel-heading">Ajout d'un Professeur</div>
  <div class="panel-body">
   <form action="ajouterP.do" method="post">
     <div class="form-group">
       <label class="control-label">Nom Professeur:</label>
       <input type="text" name="nom" class="form-control"/>
       <span></span>
     </div>
     <div class="form-group">
       <label class="control-label">Pr�nom Professeur:</label>
       <input type="text" name="prenom" class="form-control"/>
       <span></span>
     </div>
     <div class="form-group">
       <label class="control-label">Email:</label>
       <input type="text" name="email" class="form-control"/>
       <span></span>
     </div>
     <div class="form-group">
       <label class="control-label">Num�ro de T�l�phone:</label>
       <input type="text" name="tel" class="form-control"/>
       <span></span>
     </div>
     <div>
      <button type="submit" class="btn btn-danger">Ajouter</button>
     </div>
   </form>
    
  </div>
</div>
</div>
</body>
</html>