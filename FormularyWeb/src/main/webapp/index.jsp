


<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<html lang="en">
<head>

    <meta charset="utf-8">
    <link href="css/estilos.css" rel="stylesheet">
    <title>Registro</title>
</head>
<body>
  <div class="container">
    <div class="image">
      <img src="img/logo.png" alt="Image">
    </div>
    <div class="form-container">
      <h2>Rellena el formulario para recibir la guía gratuita</h2>
      <form>
        
		<label for="lastname">Nombre:</label>
		<input type="text" id="name" name="name"  required>
         
		<label for="apellido">Apellido:</label>
        <input type="text" id="lastname" name="lastname" required>
       

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>

        <label for="position">Puesto de Empresa:</label>
        <select id="position" name="position">
          <option value="Desarrollador_Back">Desarrollador Back</option>
          <option value="Desarrollador_Front">Desarrollador Front</option>
          <option value="Analista">Analista</option>
          
        </select>

        <label for="company_type">Tipo de Empresa:</label>
        <select id="company_type" name="company_type">
          <option value="Empresa_privadas">Empresa privadas</option>
          <option value="Empresa_pública">Empresa pública</option>
          <option value="Empresa_mixta">Empresa mixta</option>
          
        </select>

        <label for="num_employees">Número de Trabajadores:</label>
        <select id="num_employees" name="num_employees">
          <option value="1">1-10</option>
          <option value="2">11-20</option>
          <option value="3">21-50</option>
        </select>

        <div class="row">
          <label class="checkbox-label" for="privacy_policy">
            <input type="checkbox" id="privacy_policy" name="privacy_policy" required>
            Acepto las políticas de privacidad
          </label>
        </div>

        <div class="row">
          <label class="checkbox-label" for="subscription">
            <input type="checkbox" id="subscription" name="subscription">
            Suscribirse
          </label>
        </div>

        <input id="send" name="send" type="submit" value="send">
      </form>
    </div>
  </div>
</body>
</html>

</html>
