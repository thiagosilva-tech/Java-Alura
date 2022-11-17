package br.com.thiago.loja.pedido.acao;

import br.com.thiago.loja.pedido.Pedido;

public class LogDePedidos implements AcaoAposGerarPedido {

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Pedido foi gerado: " + pedido);
		
	}
	
}
