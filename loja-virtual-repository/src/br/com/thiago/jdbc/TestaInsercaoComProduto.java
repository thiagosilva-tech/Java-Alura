package br.com.thiago.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.thiago.jdbc.dao.ProdutoDAO;
import br.com.thiago.jdbc.modelo.Produto;

public class TestaInsercaoComProduto {

	public static void main(String[] args) throws SQLException {

		Produto comoda = new Produto("Cômoda", "Cômoda Vertical");

		try (Connection connection = new ConnectionFactory().recuperarConexao()) {
			ProdutoDAO produtoDAO = new ProdutoDAO(connection);
			produtoDAO.salvar(comoda);
			//Lista = persistenciaProduto.listar();
		}
	}
}
