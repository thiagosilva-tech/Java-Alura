package br.com.thiago.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import br.com.thiago.loja.orcamento.ItemOrcamento;
import br.com.thiago.loja.orcamento.Orcamento;
import br.com.thiago.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {
	
	private List<AcaoAposGerarPedido> acoesAposGerarPedido;
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoesAposGerarPedido) {
		this.acoesAposGerarPedido = acoesAposGerarPedido;
	}
	
	public void execute(GeraPedido geraPedido) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);
		
		this.acoesAposGerarPedido.forEach(a -> a.executarAcao(pedido));
	}
}
