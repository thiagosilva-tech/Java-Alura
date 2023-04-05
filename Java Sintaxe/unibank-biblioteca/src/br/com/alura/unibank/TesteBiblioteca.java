package br.com.alura.unibank;

import br.com.unibank.banco.modelo.Conta;
import br.com.unibank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123, 321);
		c.deposita(200.3);
		
		System.out.println(c.getSaldo());
	}

}
