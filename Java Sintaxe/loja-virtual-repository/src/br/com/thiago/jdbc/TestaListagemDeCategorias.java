package br.com.thiago.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.thiago.jdbc.dao.CategoriaDAO;
import br.com.thiago.jdbc.factory.ConnectionFactory;
import br.com.thiago.jdbc.modelo.Categoria;
import br.com.thiago.jdbc.modelo.Produto;

public class TestaListagemDeCategorias {

	public static void main(String[] args) throws SQLException {

		try (Connection connection = new ConnectionFactory().recuperarConexao()) {
			CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
			List<Categoria> listaDeCategoria = categoriaDAO.listarComProdutos();
			listaDeCategoria.stream().forEach(ct -> {
				System.out.println(ct.getNome());
				for (Produto produto : ct.getProdutos()) {
					System.out.println(ct.getNome() + " - " + produto.getNome());
				}
			});
		}
	}
}
