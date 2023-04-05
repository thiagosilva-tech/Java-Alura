package br.com.unibank.banco.test;

import br.com.unibank.banco.modelo.CalculadorDeImposto;
import br.com.unibank.banco.modelo.ContaCorrente;
import br.com.unibank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);

		SeguroDeVida Seguro = new SeguroDeVida();

		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(Seguro);

		System.out.println(calc.getTotalImposto());
	}
}
