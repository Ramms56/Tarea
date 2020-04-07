<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="/struts-tags" prefix="s" %>
        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar ponente</title>
</head>
<body>
   <center>
   <h3>Ingrese sus datos</h3>
   <fieldset style="width: 300px;">
   <s:form action="Registro">
      <s:textfield label="id" name="txtId"></s:textfield>
      <s:textfield label="nombrecompleto" name="txtNom"></s:textfield>
      <s:radio label="Sexo" name="rdSexo" list="#{'F':'Femenino','M':'Masculino' }"></s:radio>
      <s:file label="foto" name="flfoto"></s:file>
      <s:file label="cv" name="flcv"></s:file>
      <s:textfield label="nivelacademico" name="txtNivAcd"></s:textfield>
      <s:textfield label="cuenta" name="txtCuenta"></s:textfield>
      <s:password label="password" name="txtPwd"></s:password>
      <s:textfield label="correo" name="txtEmail"></s:textfield>
      
      <s:submit value="Registrar"></s:submit>
  </s:form>
  </fieldset>
  </center>
</body>
</html>