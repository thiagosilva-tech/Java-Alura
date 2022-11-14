package br.com.thiago.loja.orcamento.situacao;

import java.math.BigDecimal;
import br.com.thiago.loja.DomainException;
import br.com.thiago.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {
	
	public abstract BigDecimal calcularValorDescontoExtra(Orcamento orcamento);
	
	public void aprovar(Orcamento orcamento) throws DomainException {
		throw new DomainException("Orcamento nao pode ser aprovado!");
	}
	public void reprovar(Orcamento orcamento) throws DomainException {
		throw new DomainException("Orcamento nao pode ser reprovado!");
	}
	public void finalizar(Orcamento orcamento) throws DomainException{
		throw new DomainException("Orcamento nao pode ser finalizado!");
	}
}
