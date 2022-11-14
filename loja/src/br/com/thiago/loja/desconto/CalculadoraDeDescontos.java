package br.com.thiago.loja.desconto;

import java.math.BigDecimal;

import br.com.thiago.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDeDesconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()));

		return cadeiaDeDesconto.calcular(orcamento);
	}
}
