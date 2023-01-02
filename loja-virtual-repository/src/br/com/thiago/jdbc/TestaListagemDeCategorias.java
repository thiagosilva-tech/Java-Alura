package br.com.thiago.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.thiago.jdbc.dao.CategoriaDAO;
import br.com.thiago.jdbc.dao.ProdutoDAO;
import br.com.thiago.jdbc.factory.ConnectionFactory;
import br.com.thiago.jdbc.modelo.Categoria;
import br.com.thiago.jdbc.modelo.Produto;

public class TestaListagemDeCategorias {

	public static void main(String[] args) throws SQLException {

		try (Connection connection = new ConnectionFactory().recuperarConexao()) {
			CategoriaDAO categoriaDAO = new CategoriaDAO(connection);
			List<Categoria> listaDeCategoria = categoriaDAO.listar();
			listaDeCategoria.stream().forEach(ct -> {
				System.out.println(ct.getNome());
				try {
					for (Produto produto : new ProdutoDAO(connection).buscar(ct)) {
						System.out.println(ct.getNome() + " - " + produto.getNome());
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			});
		}
	}
}
