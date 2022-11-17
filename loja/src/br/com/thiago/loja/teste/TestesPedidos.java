package br.com.thiago.loja.teste;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.thiago.loja.pedido.GeraPedido;
import br.com.thiago.loja.pedido.GeraPedidoHandler;
import br.com.thiago.loja.pedido.acao.EnviarEmailPedido;
import br.com.thiago.loja.pedido.acao.LogDePedidos;
import br.com.thiago.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;

		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new SalvarPedidoNoBancoDeDados(),
				new EnviarEmailPedido(),
				new LogDePedidos()));
		
		handler.execute(gerador);
	}

}
