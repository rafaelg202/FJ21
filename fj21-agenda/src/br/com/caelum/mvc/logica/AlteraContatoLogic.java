package br.com.caelum.mvc.logica;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class AlteraContatoLogic implements Logica{
	
	public String executa (HttpServletRequest req, HttpServletResponse res)
		throws Exception {
			return null;
		
		/*long id = Long.parseLong(req.getParameter("id"));
		String email = req.getParameter("email");
		String endereco = req.getParameter("endereco");
		String nome = req.getParameter("nome");
		Date dataNascimento = Date.parse(req.getParameter("dataNascimento"));
		
		Contato contato = new Contato();
		contato.setId(id);
		contato.setDataNascimento(dataNascimento);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		contato.setNome(nome);
		
		ContatoDao dao = new ContatoDao();
		dao.atualiza(contato);
		
		System.out.println("Alterando Contato...");
		
		return "mvc?logica=ListaContatosLogic";*/
		
	}

}
