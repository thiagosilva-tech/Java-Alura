package br.com.thiago.loja.teste;
import java.math.BigDecimal;

import br.com.thiago.loja.imposto.CalculadoraDeImpostos;
import br.com.thiago.loja.imposto.ICMS;
import br.com.thiago.loja.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		System.out.println(calculadora.calcular(orcamento, new ICMS()));
		

	}

}
