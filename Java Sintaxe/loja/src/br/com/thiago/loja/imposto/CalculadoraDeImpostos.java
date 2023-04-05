package br.com.thiago.loja.imposto;

import java.math.BigDecimal;

import br.com.thiago.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto Imposto) {
		return Imposto.calcular(orcamento);

	}

}
