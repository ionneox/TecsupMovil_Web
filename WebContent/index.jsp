<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Campus M&oacute;vil</title>
</head>
<body>

	<form>
	<h2>Servicios REST para Campus Móvil</h2>
	
	<h3>1) Servicio de Portada y Alertas </h3>	
	
	<a href="ServiciosRest?usuario=102030&clave=tecsup00&modulo=login">Servicio de autentificación</a>
	<br/>
	
	<h3>2) Servicio de Diálogos </h3>
	
	<a href="ServiciosRest?usuario=102030&clave=tecsup00&modulo=dialogo&accion=listar">Servicio de listado de diálogos</a>
	<br/>
	<a href="ServiciosRest?usuario=102030&clave=tecsup00&modulo=dialogo&accion=obtener&codDialogo=503">Servicio de recuperación de un diálogo</a>
	<br/>
	<a href="ServiciosRest?usuario=102030&clave=tecsup00&modulo=dialogo&accion=responder&codDialogo=503&contenido=Gracias por la información profesor">Servicio de respuesta de un diálogo</a>
		
	<h3>3) Servicio de Avisos </h3>
	
	<a href="ServiciosRest?usuario=102030&clave=tecsup00&modulo=avisos&accion=listar">Servicio de listado de avisos</a>
	<br/>
	<a href="ServiciosRest?usuario=102030&clave=tecsup00&modulo=avisos&accion=obtener&codAviso=972">Servicio de recuperación de un aviso</a>
	<br/>
	
	<h3>4) Servicio de Notas </h3>

	<a href="ServiciosRest?usuario=102030&clave=tecsup00&modulo=notas&accion=listar_cursos">Servicio de listado de cursos actuales</a>
	<br/>
	<a href="ServiciosRest?usuario=102030&clave=tecsup00&modulo=notas&accion=obtener&codCurso=1">Servicio de recuperación de notas de un curso</a>
	
	
	<h3>5) Servicio de Noticias </h3>
	
	<a href="ServiciosRest?usuario=102030&clave=tecsup00&modulo=noticias&accion=listar_categorias">Servicio de listado de categorías</a>
	<br/>
	<a href="ServiciosRest?usuario=102030&clave=tecsup00&modulo=noticias&accion=listar_noticias&codCategoria=2">Servicio de listado de noticias de una categoría</a>
	<br/>
	<a href="ServiciosRest?usuario=102030&clave=tecsup00&modulo=noticias&accion=obtener&codNoticia=10">Servicio de recuperación de los detalles de una noticia</a>
		
	
	<h3>6) Servicio de Horarios </h3>
	
	<a href="ServiciosRest?usuario=102030&clave=tecsup00&modulo=horarios&accion=listar&dia=">Servicio de horarios</a>
	
	<h3>7) Servicio de Buzón </h3>
	
	<a href="ServiciosRest?usuario=102030&clave=tecsup00&modulo=buzon&accion=listar">Servicio de listado de mensajes del buzón</a>
	<br/>
	<a href="ServiciosRest?usuario=102030&clave=tecsup00&modulo=buzon&accion=obtener&idMensaje=657">Servicio de obtención de un mensaje del buzón</a>
	
	</form>
</body>
</html>