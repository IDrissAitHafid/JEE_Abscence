<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Produits</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
</head>
<body>
<%@include file="header.jsp" %>
<div class="container col-md-8 col-md-offset-2">
	<div class="panel panel-primary">
		<div class="panel-heading">Editer Etudiant</div>
		<div class="panel-body">
			<form action="editEtudiant.do?id=${etudiant.id_etudiant}" method="POST">
				<%-- <div class="form-group">
					<label class="control-label">ID:</label>
					<input type="text" name="id" value="${produit.id}" class="form-control" required="required"/>
				</div> --%>
				<div class="form-group">
					<label class="control-label">Nom Etudiant:</label>
					<input type="text" name="nomEtud" value="${etudiant.nom_etudiant}" class="form-control" required="required"/>
				</div>
				<div class="form-group">
					<label class="control-label">Prenom Etudiant:</label>
					<input type="text" name="prenomEtud" value="${etudiant.prenom_etudiant}" class="form-control" required="required"/>
				</div>
				<div class="form-group">
					<label class="control-label">Date de Naissance:</label>
					<input type="text" name="date" value="${etudiant.date}" class="form-control" required="required"/>
				</div>
				<div class="form-group">
					<label class="control-label">Nom Groupe:</label>
					<input type="text" name="nomGrp" value="${etudiant.nom_groupe}" class="form-control" required="required"/>
				</div>
				
				
				<button type="submit" class="btn btn-primary">Editer</button>
			</form>
		</div>
	</div>
</div>
</body>
</html>