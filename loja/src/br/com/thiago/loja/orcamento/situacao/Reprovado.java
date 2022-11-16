package br.com.thiago.loja.orcamento.situacao;

import br.com.thiago.loja.DomainException;
import br.com.thiago.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {
	
	public void finalizar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Finalizado());
	}

	
}
