package br.com.thiago.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.thiago.gerenciador.modelo.Banco;
import br.com.thiago.gerenciador.modelo.Empresa;

public class ListaEmpresas {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Listando empresa");
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();

		request.setAttribute("empresas", lista);
		
		return "forward:/listaEmpresas.jsp";
		
	}
}
