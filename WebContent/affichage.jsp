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
<div class="container col-md-10 col-md-offset-1">
<div class="panel panel-danger">
  <div class="panel-heading">Liste des Professeurs</div>
  <div class="panel-body">
    <table class="table table-striped">
    <tr>
     <th>ID Professeur</th><th>Nom Professeur</th><th>Prénom Professeur</th><th>Email</th><th>Numéro Téléphone</th>
    </tr>
    <c:forEach items="${modelP.professeurs}" var="p">
					<tr>
						<td>${ p.id_professeur }</td>
					    <td>${ p.nom_professeur }</td> 
			   			<td>${ p.prenom_professeur }</td>
						<td>${ p.email }</td>
						<td>${ p.numero_Telephone }</td>
						<td><a onclick="return confirm('Etes vous sûre?')"  href="supprimerProf.do?id=${p.id_professeur}">Supprimer</a></td> 
						<td><a href="editProf.do?id=${p.id_professeur}">Edit</a></td>
						

					</tr>
				</c:forEach> 
    </table>
  </div>
</div>
</div>
</body>
</html>