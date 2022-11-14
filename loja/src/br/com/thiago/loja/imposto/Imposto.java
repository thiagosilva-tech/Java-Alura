package br.com.thiago.loja.imposto;

import java.math.BigDecimal;

import br.com.thiago.loja.orcamento.Orcamento;

public interface Imposto {
	BigDecimal calcular (Orcamento orcamento);
	
}
