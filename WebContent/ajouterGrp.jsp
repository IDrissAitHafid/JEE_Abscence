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
  <div class="panel-heading">Ajout d'un Groupe</div>
  <div class="panel-body">
   <form action="ajouterGrp.do" method="post">
     <div class="form-group">
       <label class="control-label">Nom Groupe:</label>
       <input type="text" name="nomGrp" class="form-control"/>
       <span></span>
     </div>
     <div class="form-group">
       <label class="control-label">UE:</label>
       <input type="text" name="UE" class="form-control"/>
       <span></span>
     </div>
 
      <button type="submit" class="btn btn-danger">Ajouter</button>
     </div>
   </form>
    
  </div>
</div>
</div>
</body>
</html>