package br.com.thiago.loja.teste;

import java.math.BigDecimal;

import br.com.thiago.loja.imposto.CalculadoraDeImpostos;
import br.com.thiago.loja.imposto.ICMS;
import br.com.thiago.loja.imposto.ISS;
import br.com.thiago.loja.orcamento.ItemOrcamento;
import br.com.thiago.loja.orcamento.Orcamento;

public class TestesImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ICMS(new ISS(null))));
	}

}
