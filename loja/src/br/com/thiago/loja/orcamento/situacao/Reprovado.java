package br.com.thiago.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.thiago.loja.DomainException;
import br.com.thiago.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {
	
	@Override
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orcamento reprovado nao pode ter desconto extra!");
	}
	
		@Override
	public void finalizar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Finalizado());
	}

	
}
