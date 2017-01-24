package br.com.caelum.mvc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.mysql.jdbc.Connection;

import br.com.caelum.agenda.ConnectionFactory;

@WebFilter("*")
public class Filtro implements Filter{
	
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException{
		System.out.println("Entrei no Filtro");
		//Connection cnx = new ConnectionFactory().getConnection();
		//req.setAttribute("cnx", cnx);
		chain.doFilter(req, resp);
		System.out.println("Sai do filtro");
		
	System.out.println("Filtrou");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}
