<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,
br.com.caelum.agenda.dao.*,
br.com.caelum.agenda.modelo.*" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- Comentario em JSP aqui: nossa primeira página JSP --%>
	
	<%
		String mensagem = "Bem vindo ao sistema de agenda de FJ-211";
	%>
	<% out.println(mensagem); %>
	
	<br />
	<h1>Lista de Contatos</h1>
	
	<%
	ContatoDao dao = new ContatoDao();
	List<Contato> contatos = dao.getLista();
	
	for(Contato contato : contatos){
	%>
		<tr>
			<p> Nome: <%=contato.getNome()%></p>
			<p> Email: <%=contato.getEmail() %></p>
			<p> Endereço: <%=contato.getEndereco() %></p>
			<p></p>
		</tr>
		
	<%
	}
	%>
	
	<br />
	
	<%
		String desenvolvido = "Desenvolvido por Rafael";
	%>
	<%= desenvolvido %>
	
	<br />
	
	<%
		System.out.println("Tudo foi executado");
	%>
</body>
</html>