package br.com.unibank.banco.test;

import br.com.unibank.banco.modelo.ContaCorrente;
import br.com.unibank.banco.modelo.ContaPoupanca;
import br.com.unibank.banco.modelo.SaldoInsuficienteException;

// br.com.unibank.banco.test.TesteContas
public class TesteContas {
	
	//java.lang.String
	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);

		cc.transfere(10, cp);

		System.out.println("Conta Corrente: " + cc.getSaldo());
		System.out.println("Conta Poupanca: " + cp.getSaldo());

	}
}
