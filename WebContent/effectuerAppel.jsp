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
			<h3 style="text-align:center">Effectuer l'appel</h3>
				<form action="effectuerAppel.do" method="get">
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


		<table class="table table-bordered tab" style="text-align: center;">
			<tr>
				<th>Numéro Etudiant</th>
				<th>Nom Etudiant</th>
				<th>Prénom Etudiant</th>
				<th>Date de Naissance</th>
				<th>Abscence</th>
			</tr>
                <c:forEach items="${modelE.etudiants}" var="e">
					<tr>
						<td>${ e.id_etudiant }</td>
					    <td>${ e.nom_etudiant }</td> 
			   			<td>${ e.prenom_etudiant }</td>
						<td>${ e.date }</td>
						<td><form id="myForm" action="effectuerAppelPost.do?" method="post">
                			<div class="form-group">
                    			<input type="hidden" name="grpe" value="${ modelE.grpe}" class="form-control" required="required" />
                    			<span></span>
                			</div>
                			<div class="form-group">
                    			<input type="hidden" name="snce" value="${ modelE.snce}" class="form-control" required="required" hidden="true"/>
                    			<span></span>
                			</div>
                			<div class="form-group">
                    			<input type="hidden" name="idE" value="${ e.id_etudiant}" class="form-control" required="required" hidden="true"/>
                    			<span></span>
                			</div>
						   <select  class="form-control" id="se" name="abscent"   onchange="this.form.submit();">
							<option value="abscent">Abscent</option>
							<option value="present">Present</option>
						   </select>
						   </form>	
						</td>
					</tr>
				</c:forEach> 

		</table>
		            <div>
						<button type="submit" class="btn btn-danger">Save</button>
					</div>
	</div>