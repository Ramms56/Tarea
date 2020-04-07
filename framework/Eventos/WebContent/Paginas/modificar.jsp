<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="/struts-tags" prefix="s" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>modificar</title>
</head>
<body>
<center>
 <h3>Actualizar datos</h3>
  <fieldset style="width: 300px;">
<form action=updatedetails method="post">
<pre>
<b>id:</b><input type="text" name="id" value='<s:property value="id"/>'>
<b>nomcomp:</b><input type="text" name="nomcomp" value='<s:property value="nomcomp"/>'>
<b>sexo:</b><input type="text" name="sexo" value='<s:property value="sexo"/>'>
<b>foto:</b><input type="file" name="foto" value='<s:property value="foto"/>'>
<b>cv:</b><input type="file" name="cv" value='<s:property value="cv"/>'>
<b>nivelacademico:</b><input type="text" name="nivacd" value='<s:property value="nivacd"/>'>
<b>cuenta:</b><input type="text" name="cuenta" value='<s:property value="cuenta"/>'>
<b>password:</b><input type="text" name="pwd" value='<s:property value="pwd"/>'>
<b>correo:</b><input type="text" name="correo" value='<s:property value="correo"/>'>
   <button name="submitType" value="update" type="submit">Actualizar</button>
</pre>
</form>
</fieldset>
</center>
</body>
</html>