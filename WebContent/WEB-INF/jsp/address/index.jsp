<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Cadastrar Endereço</h3>
	<hr>
	
	<form name="registraAddress" id="registraAddress" method="post" action="<c:url value='/address/cadastrar'/>">
	
		ID Restaurante:<br/>
		<input type="text" name="${address.idRest.id}" id="${address.idRest.id}" />
		
		<br/><br/>
		
		Rua:<br/>
		<input type="text" name="${address.street}" id="${address.street}" />
	
		<br/><br/>
		
		Número:<br/>
		<input type="text" name="${address.number}" id="${address.number}" />
		
		<br/><br/>
		
		Bairro:<br/>
		<input type="text" name="${address.neighborhood}" id="${address.neighborhood}" />
		
		<br/><br/>
		
		Cidade:<br/>
		<input type="text" name="${address.city}" id="${address.city}" />
		
		<br/><br/>		
		
		<input type="submit" value="Cadastrar" />
	
	</form>

</body>
</html>