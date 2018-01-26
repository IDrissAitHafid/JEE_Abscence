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
		<div class="panel-heading">Editer Groupe</div>
		<div class="panel-body">
			<form action="editGroupe.do?id=${groupe.id_groupe}" method="POST">
				<%-- <div class="form-group">
					<label class="control-label">ID:</label>
					<input type="text" name="id" value="${produit.id}" class="form-control" required="required"/>
				</div> --%>
				<div class="form-group">
					<label class="control-label">Nom Groupe:</label>
					<input type="text" name="nomGrp" value="${groupe.nom_groupe}" class="form-control" required="required"/>
				</div>
				<div class="form-group">
					<label class="control-label">UE:</label>
					<input type="text" name="UE" value="${groupe.UE}" class="form-control"/>
				</div>
				
				<button type="submit" class="btn btn-primary">Editer</button>
			</form>
		</div>
	</div>
</div>
</body>
</html>