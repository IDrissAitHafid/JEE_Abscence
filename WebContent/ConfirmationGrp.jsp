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
<%@include file="headerP.jsp" %>
<div class="container col-md-4 col-md-offset-4 ">
<div class="panel panel-danger">
  <div class="panel-heading">Confirmation</div>
  <div class="panel-body">
     <div class="form-group">
       <label>ID Groupe:</label>
       <label>${groupe.id_groupe}</label>
     </div>
     <div class="form-group">
       <label>Nom Groupe:</label>
       <label>${groupe.nom_groupe}</label>
     </div>
     <div class="form-group">
       <label>UE:</label>
       <label>${groupe.UE}</label>
     </div>
    
  </div>
</div>
</div>
</body>
</html>