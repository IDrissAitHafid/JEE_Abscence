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

<div class="container col-md-10 col-md-offset-1">
	<div class="panel panel-primary">
		<div class="panel-heading">Recherche des groupes</div>
		<div class="panel-body">
			<form action="chercher.do">
				<label class="control-label">Recherche</label>
				<input id="motCle" name="motCle" value="${model.motCle}"/>
				<button class="btn btn-primary">Chercher</button>
			</form>
			<table class="table table-striped">
				<tr>
					<th>ID</th><th>Nom Groupe</th><th>UE</th><th></th><th></th>	
				</tr>
				<c:forEach items="${model.groupes}" var="g">
					<tr>
						<td>${ g.id_groupe }</td>
						<td>${ g.nom_groupe }</td> 
						<td>${ g.UE }</td>
						<td><a onclick="return confirm('Etes vous sûre?')"  href="supprimeGrp.do?id=${g.id_groupe}">Supprimer</a></td> 
						<td><a href="editGrp.do?id=${g.id_groupe}">Edit</a></td>
					</tr>
				</c:forEach> 
				 
			</table>
		</div>
	</div>
</div>
</body>
</html>