<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
  <title>Tabla CRUD con Estilos</title>
  <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body> 
    
    <h1 class="title">USER INFORMATION</h1>
    <a href="">Nuevo Registro</a>
    
    <table border="1">

                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Gold Customer</th>
                    </tr>
    
     <c:forEach var="usuario" items="${usuarios}">

                        <tr>
                            <td><c:out value="${usuario.nombre}"/> </td>
                            <td><c:out value="${usuario.apellido}"/></td>
                            <td><c:out value="${usuario.email}"/></td>
                        </tr>

                    </c:forEach>
                    
                       </table>
  <div class="container">
    

 
  </div>
</body>
</html>