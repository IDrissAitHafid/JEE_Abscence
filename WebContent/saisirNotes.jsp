<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Abscence</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
</head>
<body>
<%@include file="header.jsp" %>
	<p></p>
	<div class="container">
		<header class="jumbotron" style="background-color: #BDC3C7">
			<div class="container">
			<h3 style="text-align:center">Saisir les notes</h3>
				<form action="saisirNote.do" method="get">
					<label for="sel1">Séléctionner Groupe:</label> <select
						class="form-control" id="sel1" name="grpe">
						<c:forEach items="${modelG.groupes}" var="g">
							<option>${g.nom_groupe}</option>
						</c:forEach>
					</select> <label for="sel2">Séléctionner Séance:</label> <select
						class="form-control" id="sel2" name="snce">
						<c:forEach items="${modelS.seances}" var="s">
							<option>${s.nom_seance}</option>
						</c:forEach>
					</select> <label for="sel3">Séléctionner Semestre:</label> <select
						class="form-control" id="sel3">
						<c:forEach items="${modelSM.semestres}" var="sm">
							<option>${sm.nom_semestre}</option>
						</c:forEach>
					</select>
					<p></p>
					<div>
						<button type="submit" class="btn btn-danger">Show
							Students</button>
					</div>
				</form>
			</div>
		</header>

<form action="ajouterEval.do" method="post">
		<table class="table table-bordered tab" style="text-align: center;">
			<tr>
				<th>Numéro Etudiant</th>
				<th>Nom Etudiant</th>
				<th>Prénom Etudiant</th>
				<th>Date de Naissance</th>
				<th>Note</th>
				<th>Abscence</th>
			</tr>
			
                <c:forEach items="${modelE.etudiants}" var="e">
					<tr>
						<td>${ e.id_etudiant }</td>
					    <td>${ e.nom_etudiant }</td> 
			   			<td>${ e.prenom_etudiant }</td>
						<td>${ e.date }</td>
						
						<td><input type="text" name="note" class="form-control" />
						   <button type="submit" class="btn btn-danger" >valider</button>
						</td>
					
						<td>
						   <select class="form-control" id="sel">
							<option>justifié</option>
							<option>non justifié</option>
						   </select>	
						</td>
					</tr>
				</c:forEach> 
			
		</table>
		</form>
		            <div>
						<button type="submit" class="btn btn-danger">Save</button>
					</div>
	</div>