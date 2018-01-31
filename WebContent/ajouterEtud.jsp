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
  <div class="panel-heading">Ajout d'un Etudiant</div>
  <div class="panel-body">
   <form action="ajouterEtud.do" method="post">
	     <div class="form-group">
	       <label class="control-label">Nom Etudiant:</label>
	       <input type="text" name="nomEtud" class="form-control"/>
	       <span></span>
	     </div>
	     <div class="form-group">
	       <label class="control-label">Prenom Etudiant:</label>
	       <input type="text" name="prenomEtud" class="form-control"/>
	       <span></span>
	     </div>
	     <div class="form-group">
	       <label class="control-label">Date de Naissance:</label>
	       <input type="text" name="date" class="form-control"/>
	       <span></span>
	     </div>
	     <div class="form-group">
	       <label class="control-label">Groupe:</label>
	       <select class="form-control" name="nomGrp" id="sel3">
	       	<c:forEach items="${modelG.groupes}" var="g">
	       		  <option>${g.nom_groupe}</option>
			</c:forEach>
	       </select>
	       <span></span>
	     </div>
	 	
	      <button type="submit" class="btn btn-danger">Ajouter</button>
   </form>
    </div>
  </div>
</div>
</body>
</html>