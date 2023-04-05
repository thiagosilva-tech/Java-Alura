package br.com.thiago.jdbc;
import java.sql.Connection;
import java.sql.SQLException;

import br.com.thiago.jdbc.factory.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		
	ConnectionFactory connectionFactory = new ConnectionFactory();
	Connection connection = connectionFactory.recuperarConexao();
		
	System.out.println("Fechando conexão!!");
	connection.close();
	
	}

}
