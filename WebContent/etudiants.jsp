<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
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
		<div class="panel-heading">Recherche des Etudiants</div>
		<div class="panel-body">
			<form action="chercherEtud.do">
				<label class="control-label">Recherche</label>
				<input id="motCle" name="motCleEt" value="${model.motCleEt}"/>
				<button class="btn btn-danger">Chercher</button>
			</form>
			<table class="table table-striped">
				<tr>
					<th>ID</th><th>Nom Etudiant</th><th>Prenom Etudiant</th><th>Date</th><th>Groupe</th><th></th><th></th>	
				</tr>
				<c:forEach items="${model.etudiants}" var="e">
					<tr>
						<td>${ e.id_etudiant }</td>
						<td>${ e.nom_etudiant }</td> 
						<td>${ e.prenom_etudiant }</td>
						<td>${ e.date }</td>
						<td>${ e.nom_groupe }</td>
 						<td><a onclick="return confirm('Etes vous sûre?')"  href="supprimerEtud.do?id=${e.id_etudiant}">Supprimer</a></td> 
 						<td><a href="editEtud.do?id=${e.id_etudiant}">Edit</a></td> 
					</tr>
				</c:forEach> 
				 
			</table>
		</div>
	</div>
</div>
</body>
</html>