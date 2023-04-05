package br.com.thiago.rh.service;

import java.math.BigDecimal;

import br.com.thiago.rh.model.Funcionario;

public interface ValidacaoReajuste {
	
	void validar(Funcionario funcionario, BigDecimal aumento);
}
