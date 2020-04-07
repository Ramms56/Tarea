<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="/struts-tags" prefix="s" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>reporte</title>
<style>
table, td, th {border: 1px solid black;}
table {border-collapse: collapse;width: 60%;}
th {height: 30px;}
.button-update {background-color: #008CBA;color: white;}
.button-delete {background-color: red;color: white;}
</style>
</head>
<body>
    <center>
    <s:form action="ListarPonentes.Acciones">
    <h3>listado de ponentes</h3>
    <div style="margin-top: 40px;">
    <table>
    <thead>
    <tr style="background-color: #E0E0E1;">
    <th>ID</th>
    <th>Nombre</th>
    <th>Sexo</th>
    <th>Foto</th>
    <th>CV</th>
    <th>Nivel academico</th>
    <th>Cuenta</th>
    <th>Password</th>
    <th>Correo</th>
    <th>Boton</th>
    </tr>
    </thead>
    <tr>
    <td><s:property value="id"/></td>
    <td><s:property value="nomcomp"/></td>
    <td><s:property value="sexo"/></td>
    <td><s:property value="foto"/></td>
    <td><s:property value="cv"/></td>
    <td><s:property value="nivacd"/></td>
    <td><s:property value="cuenta"/></td>
    <td><s:property value="pwd"/></td>
    <td><s:property value="correo"/></td>
    <td>
    <a href="updatedetails.action?submitType=updatedata&id=<s:property value="id"/>">
        <button class="button-update">Update</button>
    </a>
    <a href="deleterecord.action?nomcomp=<s:property value="nomcomp"/>">
        <button class="button-delete">Delete</button>
    </a>
    </td>
    </tr>
    </table>
    </div>
    </s:form>
    </center>
</body>
</html>