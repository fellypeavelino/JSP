<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	destino 
	<%
		String nome = (String) request.getAttribute("nome");//pega variavel
		out.println(nome);
		out.println("<br/>");
		HttpSession sesao = request.getSession();//session_start();
		out.println(sesao.getAttribute("SESSION"));//session
		//session.removeAttribute("infomsg"); destroi session
		out.println("<br/>");
		out.println(application.getAttribute("nomeGlobal"));//outra forma de session
	%>
</body>
</html>
<!--http://www.caelum.com.br/apostila-java-web/apendice-topicos-da-servlet-api/#19-9-o-servletcontext-e-o-escopo-de-aplicacao-->