package br.com.thiago.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.thiago.loja.DomainException;
import br.com.thiago.loja.orcamento.Orcamento;

public class Finalizado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
	}
	
}
